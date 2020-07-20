package com.lml.part.leetcode.geek._02.repeat;

import com.lml.part.leetcode.geek._02.Node;
import com.lml.part.leetcode.geek._02.NodeUtils;
import org.junit.Assert;

/**
 * @author shuishan
 * @date 2020/5/15
 */
public class BaseDemoA {

    public static void main(String[] args) {
        System.out.println("-------------------- reverse");
        testReverse();
        System.out.println("-------------------- middle");
        testMiddle();
        System.out.println("-------------------- merge");
        testMerge();
        System.out.println("-------------------- delete");
        testDelete();
        System.out.println("--------------------");
    }

    private static void testMiddle() {
        Node head = build(1, 2, 3, 4, 5);
        NodeUtils.show(head);
        Assert.assertEquals(3, middleNode(head));
        Node head1 = build(1, 2, 3, 4);
        NodeUtils.show(head1);
        Assert.assertEquals(2, middleNode(head1));
    }

    private static void testReverse() {
        Node node = build(1, 2, 3, 4, 5);
        NodeUtils.show(node);
        Node reverse = reverse(node);
        NodeUtils.show(reverse);
    }

    private static void testMerge() {
        Node first = build(1, 3, 5, 6);
        NodeUtils.show(first);
        Node two = build(2, 4, 6, 7);
        NodeUtils.show(two);
        Node merge = merge(first, two);
        NodeUtils.show(merge);
    }

    private static void testDelete() {
        Node head = build(1, 2, 3, 4, 5);
        NodeUtils.show(head);
        Node result = deleteNode(head, 3);
        NodeUtils.show(result);
    }

    public static Node deleteNode(Node head, int n) {
        if (head == null) {
            return null;
        }
        int step = n;
        Node fast = head;
        while (fast != null && step > 0) {
            fast = fast.next;
            step--;
        }
        if (fast == null) {
            return head;
        }
        Node cur = new Node(0);
        cur.next = head;
        while (fast != null) {
            fast = fast.next;
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }

    public static Node merge(Node first, Node two) {
        if (first == null) {
            return two;
        }
        if (two == null) {
            return null;
        }
        Node dummy = new Node(0);
        Node head = dummy;
        while (first != null && two != null) {
            if (first.val <= two.val) {
                dummy.next = new Node(first.val);
                first = first.next;
                dummy = dummy.next;
            } else {
                dummy.next = new Node(two.val);
                two = two.next;
                dummy = dummy.next;
            }
        }
        if (first != null) {
            dummy.next = first;
        }
        if (two != null) {
            dummy.next = two;
        }
        return head.next;
    }

    public static int middleNode(Node head) {
        if (head == null) {
            return 0;
        }
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.val;
    }

    public static Node reverse(Node head) {
        if (head == null) {
            return null;
        }
        Node node = null;
        while (head != null) {
            Node next = head.next;
            head.next = node;
            node = head;
            head = next;
        }
        return node;
    }

    public static Node build(int... args) {
        Node dummy = new Node(0);
        Node head = dummy;
        for (int arg : args) {
            dummy.next = new Node(arg);
            dummy = dummy.next;
        }
        return head.next;
    }

}
