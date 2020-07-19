package com.lml.part.demo.juc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shuishan
 * @date 2020/6/17
 */
public class Demo {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();

        lock.unlock();

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.poll();
        System.out.println(queue);

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.pop();
        System.out.println(stack);

    }
}
