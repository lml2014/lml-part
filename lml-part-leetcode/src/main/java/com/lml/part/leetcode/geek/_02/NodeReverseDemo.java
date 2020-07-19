package com.lml.part.leetcode.geek._02;

/**
 * @author shuishan
 * @date 2020/3/19
 */
public class NodeReverseDemo {

    public static void main(String[] args) {
        Node head = NodeUtils.buildNode(1, 2, 3, 4, 5, 6);
        NodeUtils.show(head);
        Node reverseNode = reverseNode(head);
        NodeUtils.show(reverseNode);
    }

    public static Node reverseNode(Node head) {
        Node cur = head;
        Node tmp = null;
        while (cur != null) {
            Node next = cur.next;
            cur.next = tmp;
            tmp = cur;
            cur = next;
        }
        return tmp;
    }
}
