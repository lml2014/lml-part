package com.lml.part.leetcode.summary.merge;

import com.lml.part.leetcode.ListNode;
import com.lml.part.leetcode.ListNodeUtils;

/**
 * r1,
 *
 * @author shuishan
 * @date 2020/2/24
 */
public class OrderMergeDemo {

    public static void main(String[] args) {
        ListNode head1 = ListNodeUtils.buildListNode(1, 3, 7);
        ListNode head2 = ListNodeUtils.buildListNode(1, 2, 4, 8);
        ListNode merge = orderMerge(head1, head2);
        ListNodeUtils.show(merge);
    }

    public static ListNode orderMerge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ListNode next = new ListNode(l1.val);
                head.next = next;
                head = next;
                l1 = l1.next;
            } else {
                ListNode next = new ListNode(l2.val);
                head.next = next;
                head = next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            head.next = l1;
        }
        if (l2 != null) {
            head.next = l2;
        }
        return temp.next;
    }

}
