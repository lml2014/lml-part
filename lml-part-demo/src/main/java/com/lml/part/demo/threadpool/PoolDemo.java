package com.lml.part.demo.threadpool;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author shuishan
 * @date 2020/3/30
 */
public class PoolDemo {

    private Map<String, Integer> nameMap;

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        PoolDemo demo = new PoolDemo();
        for (int i = 0; i < 10000; i++) {
            executorService.submit(() -> {
                Map<String, Integer> nameMap = demo.getNameMap();
                System.out.println(Thread.currentThread().getName() + " size:" + nameMap.hashCode());
            });
        }

        System.out.println(JSON.toJSONString(demo.getNameMap()));
        Thread.sleep(10 * 1000);
        executorService.shutdown();
    }

    public Map<String, Integer> getNameMap() {
        if (nameMap != null) {
            return nameMap;
        }
        nameMap = new HashMap<>();
        List<Integer> names = buildNames();
        for (Integer name : names) {
            nameMap.put(name.toString(), name);
        }
        return nameMap;
    }

    public List<Integer> buildNames() {
        return Lists.newArrayList(1, 2, 3, 4, 5);
    }
}
