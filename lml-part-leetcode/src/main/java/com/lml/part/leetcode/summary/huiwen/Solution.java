package com.lml.part.leetcode.summary.huiwen;

import com.lml.part.leetcode.ListNode;
import com.lml.part.leetcode.ListNodeUtils;

/**
 * r1,
 * @author shuishan
 * @date 2020/2/17
 */
public class Solution {

    public static void main(String[] args) {
        ListNode head = ListNodeUtils.buildListNode(1, 2, 3, 2, 1);
        ListNodeUtils.show(head);
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reverse = reverseListNode(slow.next);
        while (head != null && reverse != null) {
            if (head.val != reverse.val) {
                return false;
            }
            head = head.next;
            reverse = reverse.next;
        }
        return true;
    }

    public static ListNode reverseListNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverseListNode(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

}
