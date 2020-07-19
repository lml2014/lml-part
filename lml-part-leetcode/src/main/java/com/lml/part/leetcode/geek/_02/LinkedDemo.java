package com.lml.part.leetcode.geek._02;

import java.util.LinkedList;

/**
 * @author shuishan
 * @date 2020/3/20
 */
public class LinkedDemo {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.offer(2);
        list.offerFirst(0);
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);
    }
}
