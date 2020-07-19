package com.lml.part.demo.threadpool;

import com.alibaba.fastjson.JSON;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author shuishan
 * @date 2020/3/4
 */
public class PoolExceptionDemo {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Runnable task = () -> {
            Integer i = new Integer(3);
            System.out.println(i / (i - 3));
            System.out.println("success");
        };

        executorService.execute(task);
        Thread.sleep(2000);
        System.out.println("-----sleep-------");
        executorService.execute(task);
        executorService.shutdown();

    }
}
