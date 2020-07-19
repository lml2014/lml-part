package com.lml.part.demo.threadpool;

import java.time.LocalTime;
import java.util.concurrent.*;

/**
 * @author shuishan
 * @date 2020/6/11
 */
public class CustomPoolDemo {

    public static void main(String[] args) throws Exception {
        ThreadPoolExecutor executorService = new ThreadPoolExecutor(1, 2, 10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1));
        for (int i = 0; i < 3; i++) {
            executorService.submit(buildRunnable(i));
        }
        System.out.println("activeSize:" + executorService.getActiveCount());
        System.out.println("queueSize:" + executorService.getQueue().size());


        Thread.sleep(15 * 1000);
        System.out.println("activeSize:" + executorService.getActiveCount());
        System.out.println("queueSize:" + executorService.getQueue().size());
        executorService.submit(buildRunnable(100));
        executorService.submit(buildRunnable(101));
        executorService.submit(buildRunnable(102));
    }

    private static Runnable buildRunnable(int id) {
        return () -> {
            try {
                System.out.println(Thread.currentThread().getName() + "[" + id + "] sleep ... start.time:" + LocalTime.now());
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "[" + id + "] sleep ... end");
        };
    }
}
