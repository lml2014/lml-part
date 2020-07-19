package com.lml.part.rocketmq.tags;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;

import java.io.UnsupportedEncodingException;
import java.util.stream.Collectors;

/**
 * @author shuishan
 * @date 2020/3/12
 */
public class ConsumerTagAD {

    public static void main(String[] args) throws MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("consumer_tags_group");

        consumer.setNamesrvAddr("localhost:9876");

//        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);

        consumer.subscribe("orderTopic", "*");
//        consumer.subscribe("TopicSimple", "REMOTE");

        consumer.registerMessageListener((MessageListenerConcurrently) (msgs, context) -> {
            System.out.println("Tag[A || D] [" + Thread.currentThread().getName() + "]接收到信息:" + msgs);
            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        });
        consumer.start();

        System.out.println("start ......");

    }
}
