package com.lml.part.rocketmq.simple;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.*;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shuishan
 * @date 2020/3/12
 */
public class SimpleConsumer {

    public static void main(String[] args) throws MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("simple_consumer_group");

        consumer.setNamesrvAddr("localhost:9876");

//        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);

        consumer.subscribe("TopicSimple", "LOCAL || REMOTE");
//        consumer.subscribe("TopicSimple", "REMOTE");

        consumer.registerMessageListener((MessageListenerConcurrently) (msgs, context) -> {
            System.out.println("A接收到信息:" + Thread.currentThread().getName() + " 消息:" +
                    msgs.stream().map(msg -> {
                        try {
                            String value = msg.getUserProperty("PPPP");
                            String body = new String(msg.getBody(), "UTF-8");
                            return value + ";body:" + body;
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                        return "";
                    }).collect(Collectors.joining()));
            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        });
        consumer.start();

        System.out.println("start ......");

    }
}
