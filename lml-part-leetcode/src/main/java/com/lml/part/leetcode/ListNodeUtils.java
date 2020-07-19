package com.lml.part.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author shuishan
 * @date 2020/2/22
 */
public class ListNodeUtils {

    public static ListNode buildListNode(int... args) {
        ListNode head = null;
        for (int i = args.length - 1; i >= 0; i--) {
            ListNode newData = new ListNode(args[i]);
            newData.next = head;
            head = newData;
        }
        return head;
    }

    public static void show(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }
        Set<Integer> values = new HashSet<>();
        StringBuilder sb = new StringBuilder("[");
        while (head != null) {
            if (values.add(head.val)) {
                sb.append(head.val).append(" ");
                head = head.next;
            }else {
                sb.append(head.val).append("(c) ");
                break;
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
