package com.lml.part.rocketmq.simple;

import com.alibaba.fastjson.JSON;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

/**
 * @author shuishan
 * @date 2020/3/25
 */
public class SimpleProducerConsumer {

    public static void main(String[] args) throws Exception {
        System.out.println("start consumer...");
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("consumer_all_group");
        consumer.setNamesrvAddr("localhost:9876");
//        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        consumer.setUnitName("ERP");
        consumer.setConsumeThreadMin(2);
        consumer.setConsumeMessageBatchMaxSize(1);
        consumer.subscribe("TopicSimpleAll", "*");
        consumer.registerMessageListener((MessageListenerConcurrently) ((msgs, context) -> {
            System.out.println(Thread.currentThread().getName() + " msags:" + JSON.toJSONString(msgs));
            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        }));
        consumer.start();
        Thread.sleep(5 * 1000);

        System.out.println("start producer...");
        DefaultMQProducer producer = new DefaultMQProducer("producer_all_group");
        producer.setNamesrvAddr("localhost:9876");
        producer.setUnitName("ERP");
        producer.start();

        for (int i = 0; i < 2; i++) {
            Message message = new Message("TopicSimpleAll", null, "这是AllTag标签".getBytes());
            SendResult result = producer.send(message);
            System.out.println("send result:" + JSON.toJSONString(result));
        }

        System.out.println("start ......");
        Thread.sleep(100 * 1000);
        System.out.println("exit!");
        consumer.shutdown();
        producer.shutdown();
    }
}
