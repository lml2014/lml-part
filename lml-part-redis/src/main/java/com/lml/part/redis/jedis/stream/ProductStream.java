package com.lml.part.redis.jedis.stream;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.StreamEntry;
import redis.clients.jedis.StreamEntryID;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shuishan
 * @date 2020/3/10
 */
public class ProductStream {

    private Jedis jedis;

    private String queueName;

    public ProductStream(Jedis jedis, String queueName) {
        this.jedis = jedis;
        this.queueName = queueName;
    }

    public StreamEntryID xadd(String key, String value) {
        Map<String, String> hash = new HashMap<String, String>();
        hash.put(key, value);
        return jedis.xadd(queueName, StreamEntryID.NEW_ENTRY, hash);
    }

    public Long xlen() {
        return jedis.xlen(queueName);
    }

    public List<StreamEntry> xrange(int count) {
        return jedis.xrange(queueName, null, null, count);
    }

    public long xdel(StreamEntryID... ids) {
        return jedis.xdel(queueName, ids);
    }

    public long del() {
        return jedis.del(queueName);
    }

}
