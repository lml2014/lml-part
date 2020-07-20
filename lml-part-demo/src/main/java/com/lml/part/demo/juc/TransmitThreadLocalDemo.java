package com.lml.part.demo.juc;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.alibaba.ttl.TtlRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author shuishan
 * @date 2020/7/20
 */
public class TransmitThreadLocalDemo {

    private static final ExecutorService executor = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws Exception {
        TransmittableThreadLocal<String> parent = new TransmittableThreadLocal<>();

        for (int i = 0; i < 3; i++) {
            executor.execute(() -> {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        Thread.sleep(4 * 1000);

        parent.set("values");

        Runnable task = () -> {
            System.out.println("parent:" + parent.get());
        };

        Runnable ttlRunable = TtlRunnable.get(task);
        executor.execute(ttlRunable);

        System.out.println("...end...");
    }
}
