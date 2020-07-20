package com.lml.part.demo.queue;

import com.alibaba.fastjson.JSON;

import java.util.PriorityQueue;

/**
 * @author shuishan
 * @date 2020/7/20
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(3);
        queue.offer(4);
        queue.offer(1);
        System.out.println(JSON.toJSONString(queue.toArray()));
        queue.poll();

    }
}
