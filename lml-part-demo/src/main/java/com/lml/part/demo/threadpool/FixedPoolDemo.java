package com.lml.part.demo.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author shuishan
 * @date 2020/6/11
 */
public class FixedPoolDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            Runnable runnable = () -> {
                try {
                    System.out.println(Thread.currentThread().getName() +" sleep ... start");
                    Thread.sleep(60 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() +" sleep ... end");
            };
            executorService.submit(runnable);
        }

        if (executorService.isTerminated()) {
            System.out.println("is terminated ...");
        }
    }
}
