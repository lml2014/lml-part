package com.lml.part.demo.threadpool;

/**
 * @author shuishan
 * @date 2020/3/4
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println(1 << 0);
        System.out.println(1 << 1);
        System.out.println(Integer.toBinaryString(2));
        System.out.println(1 << 2);
        System.out.println(Integer.toBinaryString(4));
        System.out.println(1 << 3);
        System.out.println(Integer.toBinaryString(8));
        System.out.println(1 << 4);
        System.out.println(Integer.toBinaryString(16));
        int i = 2 | 4;
        System.out.println(i);
        System.out.println((i & 2) != 0);
        System.out.println((i & 16) != 0);
    }
}
