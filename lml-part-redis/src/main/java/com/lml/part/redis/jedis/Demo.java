package com.lml.part.redis.jedis;

import redis.clients.jedis.Jedis;

/**
 * @author shuishan
 * @date 2020/3/8
 */
public class Demo {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("name", "zhanghua.");
        String name = jedis.get("name");
        System.out.println(name);
        jedis.close();
    }
}
