package com.lml.part.demo.threadpool;

import java.util.Map;

/**
 * @author shuishan
 * @date 2020/3/25
 */
public class TheadDemo {

    public static void main(String[] args) {
        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            System.out.println("threadName:" + entry.getKey());
            for (StackTraceElement element : entry.getValue()) {
                System.out.print("\t" + element + "\n");
            }
        }
    }
}
