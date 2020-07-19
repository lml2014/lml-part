package com.lml.part.demo.juc;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author shuishan
 * @date 2020/6/28
 */
public class CyclicDemo {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> {
            System.out.println("all finished ....");
        });
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " run...");
                try {
                    Thread.sleep(random.nextInt(6) * 1000);
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
        }
        System.out.println("number wait:" + cyclicBarrier.getNumberWaiting());
        System.out.println("run :" + executorService.isTerminated());
        executorService.shutdown();
        System.out.println("run :" + executorService.isTerminated());
    }
}
