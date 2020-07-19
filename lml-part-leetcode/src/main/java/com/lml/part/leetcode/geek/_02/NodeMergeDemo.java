package com.lml.part.leetcode.geek._02;

/**
 * @author shuishan
 * @date 2020/3/19
 */
public class NodeMergeDemo {

    public static void main(String[] args) {
        Node head1 = NodeUtils.buildNode(1, 3, 5, 7, 9);
        NodeUtils.show(head1);
        Node head2 = NodeUtils.buildNode(2, 4, 6, 8, 10);
        NodeUtils.show(head2);
        Node merge = merge(head1, head2);
        NodeUtils.show(merge);
    }

    public static Node merge(Node h1, Node h2) {
        if (h1 == null) {
            return h2;
        }
        if (h2 == null) {
            return h1;
        }
        Node cur = new Node(0);
        Node dummy = cur;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                Node n = new Node(h1.val);
                cur.next = n;
                cur = cur.next;
                h1 = h1.next;
            } else {
                Node n = new Node(h2.val);
                cur.next = n;
                cur = cur.next;
                h2 = h2.next;
            }
        }
        if (h1 != null) {
            cur.next = h1;
        }
        if (h2 != null) {
            cur.next = h2;
        }
        return dummy.next;
    }
}
