package com.lml.part.demo.juc;

import apple.laf.JRSUIConstants;
import org.omg.CosNaming.NameHolder;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author shuishan
 * @date 2020/7/20
 */
public class ThreadLocalDemo {

    public static void main(String[] args) throws Exception {
        ThreadPoolExecutor executorService = new ThreadPoolExecutor(2, 2, 0, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2), new NamedThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
        NameHolder.set("Main");
        for (int i = 0; i < 3; i++) {
            executorService.submit(() -> {
                String name = Thread.currentThread().getName();
                System.out.println("name --" + name);
                System.out.println(NameHolder.get());
            });
        }
        NameHolder.remove();

        System.out.println("count:" + executorService.getActiveCount() + ";taskCount:" + executorService.getTaskCount());
        System.out.println(executorService.getCompletedTaskCount());
    }

    private static class NameHolder {
        public static ThreadLocal<String> LOCAL = new ThreadLocal<>();
//        public static InheritableThreadLocal<String> LOCAL = new InheritableThreadLocal<>();

        public static void set(String name) {
            LOCAL.set(name);
        }

        public static String get() {
            return LOCAL.get();
        }

        public static void remove() {
            LOCAL.remove();
        }

    }
}
