package com.lml.part.demo.juc;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author shuishan
 * @date 2020/6/28
 */
public class CountDownDemo {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " run...");
                try {
                    Thread.sleep(random.nextInt(6) * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            });
        }
        System.out.println("number wait:" + countDownLatch.getCount());
        countDownLatch.await();
        System.out.println("run :" + executorService.isTerminated());
        executorService.shutdown();
        System.out.println("run :" + executorService.isTerminated());
    }
}
