package com.lml.part.rocketmq.simple;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.remoting.common.RemotingHelper;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author shuishan
 * @date 2020/3/12
 */
public class SimpleConsumerA {

    public static void main(String[] args) throws MQClientException, InterruptedException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("ec_consumer_group_3");

        consumer.setNamesrvAddr("localhost:9876");

//        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);

        consumer.subscribe("TopicSimple", "LOCAL");
        consumer.subscribe("TopicSimpleRemote", "LOCAL || REMOTE");

        consumer.registerMessageListener((MessageListenerConcurrently) (msgs, context) -> {
            System.out.println("A接收到信息:" + Thread.currentThread().getName() + " 消息:" +
                    msgs.stream().map(msg -> {
                        try {
                            return new String(msg.getBody(), "UTF-8");
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                        return "";
                    }).collect(Collectors.joining()));
            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        });
        consumer.start();

        System.out.println("start ......");
        Thread.sleep(50 * 1000);
        consumer.shutdown();
    }
}
