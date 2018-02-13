package com.yyg.leetcode;

/**
 * @author yuanyangen
 * @date 2/13/18
 */
public class RemoveDuplicatesFromSortedListII {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode ret = null;
        ListNode last = null;
        ListNode cur = head;
        if (head == null) {
            return head;
        }

        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                //跳过中途一致的节点
                while (cur.next.next != null) {
                    if (cur.val != cur.next.next.val) {
                        break;
                    }
                    cur.next = cur.next.next;
                }
                cur = cur.next.next;
            } else {
                if (last == null) {
                    last = cur;
                    ret = last;
                } else {
                    last.next = cur;
                    last = cur;
                }
                cur = cur.next;
                last.next = null;
            }
        }
        return ret;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
