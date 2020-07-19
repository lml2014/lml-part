package com.lml.part.leetcode.geek._02;

import org.junit.Assert;

/**
 * @author shuishan
 * @date 2020/3/19
 */
public class NodeMiddleDemo {

    public static void main(String[] args) {
        Node head = NodeUtils.buildNode(1, 2, 3, 4, 5);
        NodeUtils.show(head);
        Assert.assertEquals(3, middleNode(head));
        head = NodeUtils.buildNode(1, 2, 3, 4);
        Assert.assertEquals(2, middleNode(head));
    }

    public static int middleNode(Node head) {
        if (head == null) {
            return 0;
        }
        if (head.next == null) {
            return head.val;
        }
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.val;
    }

}
