package com.lml.part.rocketmq.tags;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;

/**
 * @author shuishan
 * @date 2020/3/12
 */
public class ConsumerTagF {

    public static void main(String[] args) throws MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("consumer_tags_group");

        consumer.setNamesrvAddr("localhost:9876");

//        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);

        consumer.subscribe("orderTopic", "F");
//        consumer.subscribe("TopicSimple", "REMOTE");

        consumer.registerMessageListener((MessageListenerConcurrently) (msgs, context) -> {
            System.out.println("Tag[F] [" + Thread.currentThread().getName() + "]接收到信息:" + msgs);
            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        });
        consumer.start();

        System.out.println("start ......");

    }
}
