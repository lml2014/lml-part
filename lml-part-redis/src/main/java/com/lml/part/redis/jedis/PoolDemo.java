package com.lml.part.redis.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author shuishan
 * @date 2020/3/9
 */
public class PoolDemo {

    public static void main(String[] args) {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(8);
        config.setMaxTotal(18);
        JedisPool pool = new JedisPool(config, "127.0.0.1", 6379, 2000);
        Jedis jedis = pool.getResource();
        jedis.set("key", "hangsdf");
        System.out.println(jedis.get("key"));
        jedis.close();
        pool.close();
    }
}
