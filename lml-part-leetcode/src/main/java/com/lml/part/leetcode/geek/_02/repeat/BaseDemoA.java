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
        testReverse();
        System.out.println("--------------------");
        testMiddle();
        System.out.println("--------------------");
        testMerge();
        System.out.println("--------------------");
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
        Node head = build(1, 2, 3, 4, 5);
        NodeUtils.show(head);
        Node reverse = reverse(head);
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
        if (head == null || n <= 0) {
            return head;
        }
        Node fast = head;
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return head;
            }
            fast = fast.next;
        }
        if (fast == null){
            head = head.next;
            return head;
        }
        Node cur = new Node(0);
        cur.next = head;
        while (fast != null) {
            cur = cur.next;
            fast = fast.next;
        }
        cur.next = cur.next.next;
        return cur;
    }

    public static Node merge(Node first, Node two) {
        if (first == null) {
            return two;
        }
        if (two == null) {
            return first;
        }
        Node dummy = new Node(0);
        Node head = dummy;
        Node f = first;
        Node t = two;
        while (f != null && t != null) {
            if (f.val < t.val) {
                dummy.next = new Node(f.val);
                dummy = dummy.next;
                f = f.next;
            } else {
                dummy.next = new Node(t.val);
                dummy = dummy.next;
                t = t.next;
            }
        }
        if (f != null) {
            dummy.next = f;
        }
        if (t != null) {
            dummy.next = t;
        }
        return head.next;
    }

    public static int middleNode(Node head) {
        if (head == null) {
            return 0;
        }
        if (head.next == null) {
            return head.val;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
//        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.val;
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node result = null;
        while (head != null) {
            Node next = head.next;
            head.next = result;
            result = head;
            head = next;
        }
        return result;
    }

    public static Node build(int... args) {
        Node dummy = new Node(0);
        Node head = dummy;
        for (int arg : args) {
            head.next = new Node(arg);
            head = head.next;
        }
        return dummy.next;
    }

}
