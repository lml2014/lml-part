package com.lml.part.redis.redisson.base;

import org.checkerframework.checker.units.qual.C;
import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/**
 * @author shuishan
 * @date 2020/3/18
 */
public class SetDemo {

    public static void main(String[] args) {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        RedissonClient client = Redisson.create(config);

        RBucket<String> bucket = client.getBucket("abcd");
        System.out.println(bucket.get());

        bucket.set("adsfsd");
        System.out.println(bucket.getAndDelete());
    }
}
