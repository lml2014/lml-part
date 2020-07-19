package com.lml.part.rocketmq.simple;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.log.ClientLogger;

import java.io.UnsupportedEncodingException;
import java.util.stream.Collectors;

/**
 * @author shuishan
 * @date 2020/3/12
 */
public class SimpleEcConsumer {

    public static void main(String[] args) throws MQClientException, InterruptedException {
//        System.setProperty(ClientLogger.CLIENT_LOG_LEVEL, "DEBUG");
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("ec_xml_multi_event_consumer_group");

        consumer.setNamesrvAddr("localhost:9876");

//        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);

        consumer.subscribe("TopicSimple", "*");
//        consumer.subscribe("EC_TOPIC_XML", "*");

        consumer.registerMessageListener(buildConcurrently());
        consumer.start();

        System.out.println("start ......");
        Thread.sleep(50 * 1000);
        consumer.shutdown();
    }

    public static MessageListenerConcurrently buildConcurrently() {
        return (msgs, context) -> {
            try {
                System.out.println("EC接收到信息:" + Thread.currentThread().getName() + " 消息:" +
                        msgs.stream().map(msg -> {
                            try {
                                return new String(msg.getBody(), "UTF-8");
                            } catch (UnsupportedEncodingException e) {
                                e.printStackTrace();
                            }
                            return "";
                        }).collect(Collectors.joining()));
            } catch (Exception e) {
                e.printStackTrace();
                return ConsumeConcurrentlyStatus.RECONSUME_LATER;
            }
            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        };
    }
}
