package com.lml.part.redis.redisson;

import org.checkerframework.checker.units.qual.C;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

import java.io.File;

/**
 * @author shuishan
 * @date 2020/3/8
 */
public class Demo {

    public static void main(String[] args) {
        // 1. Create config object
        Config config = new Config();
        config.useClusterServers()
                // use "rediss://" for SSL connection
                .addNodeAddress("redis://127.0.0.1:7181");
        // or read config from file
        //        config = Config.fromYAML(new File("config-file.yaml"));

        // 2. Create Redisson instance
        // Sync and Async API
        RedissonClient redisson = Redisson.create(config);

        // Reactive API
//        RedissonReactiveClient redissonReactive = Redisson.createReactive(config);

        // RxJava2 API
//        RedissonRxClient redissonRx = Redisson.createRx(config);

        // 3. Get Redis based Map
//        RMap<MyKey, MyValue> map = redisson.getMap("myMap");

//        RMapReactive<MyKey, MyValue> mapReactive = redissonReactive.getMap("myMap");

//        RMapRx<MyKey, MyValue> mapRx = redissonRx.getMap("myMap");


        // 4. Get Redis based Lock
        RLock lock = redisson.getLock("myLock");
//        RLockReactive lockReactive = redissonReactive.getLock("myLock");
//        RLockRx lockRx = redissonRx.getLock("myLock");

        // 4. Get Redis based ExecutorService
//        RExecutorService executor = redisson.getExecutorService("myExecutorService");
// over 50 Redis based Java objects and services ...

    }
}
