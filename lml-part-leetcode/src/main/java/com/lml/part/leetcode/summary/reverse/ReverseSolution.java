package com.lml.part.leetcode.summary.reverse;

import com.lml.part.leetcode.ListNode;
import com.lml.part.leetcode.ListNodeUtils;

/**
 * r1,
 *
 * @author shuishan
 * @date 2020/2/22
 */
public class ReverseSolution implements Reverse {

    public static void main(String[] args) {
        ListNode head = ListNodeUtils.buildListNode(1, 2, 3, 4, 5);
        ListNodeUtils.show(head);
        ListNode reverseListNode = reverseListNode(head);
        ListNodeUtils.show(reverseListNode);
    }

    public static ListNode reverseListNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
