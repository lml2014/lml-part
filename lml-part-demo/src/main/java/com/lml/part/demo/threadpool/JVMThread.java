package com.lml.part.demo.threadpool;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shuishan
 * @date 2020/7/1
 */
public class JVMThread {

    public static void main(String[] args) {
        System.out.println("run ...");
        new Thread(() -> {
            List<byte[]> list = new ArrayList<>();
            while (true) {
                System.out.println(LocalTime.now().toString() + Thread.currentThread() + "==");
                byte[] b = new byte[1024 * 1024 * 1];
                list.add(b);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // 线程二
        new Thread(() -> {
            while (true) {
                System.out.println(LocalTime.now().toString() + Thread.currentThread() + "==");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        System.out.println("start ...");
    }
}
