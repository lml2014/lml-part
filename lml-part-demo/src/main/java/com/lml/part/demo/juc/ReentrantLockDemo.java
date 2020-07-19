package com.lml.part.demo.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shuishan
 * @date 2020/4/26
 */
public class ReentrantLockDemo {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2, new NamedThreadFactory("test"));
        ThreadShow threadShow = new ThreadShow();
        for (int i = 0; i < 2; i++) {
            executorService.submit(threadShow);
        }

        Thread.sleep(500 * 1000);
        System.out.println("shut down ....");
        executorService.shutdown();
        if (!executorService.isShutdown()) {
            executorService.shutdownNow();
        }
    }

    private static class ThreadShow implements Runnable {

        ReentrantLock lock = new ReentrantLock(true);

        @Override
        public void run() {
            long start = System.currentTimeMillis();
            try {
                lock.lock();
                Thread.sleep(200 * 1000);
                System.out.println(Thread.currentThread() + "run ....");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            System.out.println(Thread.currentThread() + "run stop, cost:" + (System.currentTimeMillis() - start));
        }
    }
}
