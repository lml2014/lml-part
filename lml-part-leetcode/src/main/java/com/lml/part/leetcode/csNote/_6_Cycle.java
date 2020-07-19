package com.lml.part.leetcode.csNote;

import com.lml.part.leetcode.ListNode;
import com.lml.part.leetcode.ListNodeUtils;
import org.junit.Assert;

/**
 * @author shuishan
 * @date 2020/5/25
 */
public class _6_Cycle {

    public static void main(String[] args) {
        ListNode head = buildCycle(1, 2, 3, 4, 5, 3);
        ListNodeUtils.show(head);
        Assert.assertTrue(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode l1 = head;
        ListNode l2 = head.next;
        while (l1 != null && l2 != null && l2.next != null) {
            if (l1 == l2) {
                return true;
            }
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return false;
    }

    public static ListNode buildCycle(int... args) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        ListNode cycle = null;
        int lastValue = args[args.length - 1];
        for (int arg : args) {
            dummy.next = new ListNode(arg);
            dummy = dummy.next;
            if (cycle == null && arg == lastValue) {
                cycle = dummy;
            }
        }
        dummy.next = cycle;
        return head.next;
    }

}
