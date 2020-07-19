package com.lml.part.leetcode.geek._02;

/**
 * @author shuishan
 * @date 2020/3/19
 */
public class NodeUtils {

    public static Node buildNode(int... args) {
        Node node = null;
        for (int i = args.length - 1; i >= 0; i--) {
            Node n = new Node(args[i]);
            n.next = node;
            node = n;
        }
        return node;
    }

    public static void show(Node head) {
        if (head == null) {
            System.out.println("[]");
        }
        int i = 0;
        StringBuilder sb = new StringBuilder();
        Node cur = head;
        while (cur != null && i <= 30) {
            sb.append(cur.val).append(" ");
            cur = cur.next;
            i++;
        }
        System.out.println(sb.toString());
    }

}
