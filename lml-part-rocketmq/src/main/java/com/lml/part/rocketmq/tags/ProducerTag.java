package com.lml.part.rocketmq.tags;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

/**
 * @author shuishan
 * @date 2020/3/12
 */
public class ProducerTag {

    public static void main(String[] args) throws MQClientException, InterruptedException {
        DefaultMQProducer producer = new DefaultMQProducer("producer_tag_group");
        producer.setNamesrvAddr("localhost:9876");
        producer.start();

        try {
            for (int i = 0; i < 10; i++) {
                Message message = new Message("orderTopic", "A", ("local message " + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
                SendResult result = producer.send(message);
                System.out.println("返回结果：" + result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end .....");
        Thread.sleep(80 * 1000);
        producer.shutdown();
    }
}
