package com.lml.part.redis.jedis.base;

import redis.clients.jedis.Jedis;

/**
 * @author shuishan
 * @date 2020/3/18
 */
public class SetDemo {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("name","zhangsan");
        System.out.println(jedis.get("name"));
        System.out.println(jedis.del("name"));
        System.out.println(jedis.del("name"));
    }
}
