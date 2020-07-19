package com.lml.part.rocketmq.simple;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.io.UnsupportedEncodingException;

/**
 * @author shuishan
 * @date 2020/3/12
 */
public class SimpleProducer {

    public static void main(String[] args) throws MQClientException, InterruptedException {
        DefaultMQProducer producer = new DefaultMQProducer("producer_group");
        producer.setNamesrvAddr("localhost:9876");
        producer.start();

        try {
            for (int i = 0; i < 2; i++) {
                Message message = new Message("TopicSimple", "LOCAL", ("local message " + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
                message.putUserProperty("PPPP", "serializer_type_local");
                SendResult result = producer.send(message);
                System.out.println("返回结果：" + result);
            }
            for (int i = 0; i < 2; i++) {
                Message message = new Message("TopicSimple", "REMOTE", ("remote message " + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
                message.putUserProperty("PPPP", "serializer_type_remote");
                SendResult result = producer.send(message);
                System.out.println("返回结果：" + result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end .....");
        Thread.sleep(10 * 1000);
        producer.shutdown();
    }
}
