package com.lml.part.leetcode.geek._02;

/**
 * @author shuishan
 * @date 2020/3/19
 */
public class NodeCircleDemo {

    public static void main(String[] args) {
        Node head = NodeUtils.buildNode(1, 2, 4, 5, 6, 7);
        buildCircle(head);
        NodeUtils.show(head);
        System.out.println(hasCircle(head));
    }

    public static void buildCircle(Node head) {
        int n = 4;
        Node cur = head;
        Node tmp = null;
        while (cur.next != null) {
            cur = cur.next;
            if (cur.val == n) {
                tmp = cur;
            }
        }
        cur.next = tmp;
    }

    public static boolean hasCircle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
