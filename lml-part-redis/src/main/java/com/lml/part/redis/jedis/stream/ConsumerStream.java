package com.lml.part.redis.jedis.stream;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.StreamEntry;

import java.util.List;
import java.util.Map;

/**
 * @author shuishan
 * @date 2020/3/10
 */
public class ConsumerStream {

    private String queueName;

    private Jedis jedis;

    public ConsumerStream(String queueName, Jedis jedis) {
        this.queueName = queueName;
        this.jedis = jedis;
    }

    //从头创建
    public String createGroup(String groupName) {
        return jedis.xgroupCreate(queueName, groupName, null, false);
    }

    public List<Map.Entry<String, List<StreamEntry>>> consumer(String groupName, String consumer, int count) {
//        return jedis.xreadGroup(groupName, consumer, count, null, null, null);
        return null;
    }
}
