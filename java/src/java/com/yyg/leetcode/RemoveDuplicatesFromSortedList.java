package com.yyg.leetcode;

/**
 * @author yuanyangen
 * @date 2/13/18
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode ret = head;
        ListNode last = head;
        while (head != null) {
            if (last.val == head.val) {
                head = head.next;
                last.next = head;
                continue;
            }
            last.next = head;
            last = head;
            head = head.next;
        }
        return ret;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
