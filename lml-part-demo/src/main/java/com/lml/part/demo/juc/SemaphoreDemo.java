package com.lml.part.demo.juc;

import java.util.concurrent.*;

/**
 * @author shuishan
 * @date 2020/6/28
 */
public class SemaphoreDemo {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);

        ThreadPoolExecutor executorService = new ThreadPoolExecutor(8, 8, 5, TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        for (int i = 0; i < 8; i++) {
            executorService.submit(() -> {
                try {
                    String name = Thread.currentThread().getName();
                    System.out.println(name + " start run.");
                    semaphore.acquire();
                    System.out.println(name + " acquire success,running ....");
                    Thread.sleep(2 * 1000);

                    semaphore.release();
                    System.out.println(name + "release success!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });
        }

        System.out.println("end .........");
        System.out.println(executorService.getActiveCount());

        while (true) {
            System.out.println(executorService.getActiveCount() + ":" + executorService.getTaskCount());
            if (executorService.getActiveCount() == 0) {
                System.out.println("no active Count ... end");
                executorService.shutdown();
                break;
            }
        }

    }
}
