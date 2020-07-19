package com.lml.part.leetcode.geek._02;

/**
 * @author shuishan
 * @date 2020/3/19
 */
public class NodeDeleteDemo {

    public static void main(String[] args) {
        Node head = NodeUtils.buildNode(1, 2, 3, 4, 5);
        NodeUtils.show(head);
        Node result = delete(head, 3);
        NodeUtils.show(result);
    }

    public static Node delete(Node head, int n) {
        if (head == null || n <= 0) {
            return head;
        }
        Node pre = head;
        for (int i = 0; i < n; i++) {
            if (pre == null) {
                return head;
            }
            pre = pre.next;
        }
        if (pre == null) {
            return head.next;
        }
        Node cur = new Node(0);
        cur.next = head;
        while (pre != null) {
            pre = pre.next;
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }
}
