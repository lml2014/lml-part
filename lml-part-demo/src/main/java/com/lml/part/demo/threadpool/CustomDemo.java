package com.lml.part.demo.threadpool;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author shuishan
 * @date 2020/3/10
 */
public class CustomDemo {

    public static void main(String[] args) throws Exception {
        Runnable runnable = () -> {
            System.out.println("run " + Thread.currentThread().getName());
            throw new IllegalArgumentException("error");
        };
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1), new ThreadFactory() {
            final AtomicInteger count = new AtomicInteger(1);

            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, "thread name:" + count.getAndIncrement());
            }
        });

        try {
            for (int i = 0; i < 3; i++) {
                pool.execute(runnable);
            }
        } catch (RejectedExecutionException e) {
            e.printStackTrace();
            System.out.println("reject exception message:" + e.getMessage());
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("error message:" + e.getMessage());
        }
        System.out.println("sleep .......");
        Thread.sleep(2 * 1000);
        pool.shutdown();
    }
}
