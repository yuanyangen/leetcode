package com.yyg.leetcode;

/**
 * @author yuanyangen
 * @date 2/6/18
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode cur = null;
        while (true) {

            //得到当前节点的值，并移动对的节点
            int v;
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    v = l1.val;
                    l1 =l1.next;
                } else {
                    v = l2.val;
                    l2 = l2.next;
                }
            } else if (l1 == null && l2 != null) {
                v = l2.val;
                l2 = l2.next;
            } else if (l1 != null && l2 == null) {
                v = l1.val;
                l1 =l1.next;
            } else {
                break;
            }

            //将节点apend到返回的list中
            if (cur == null) {
                cur = new ListNode(v);
                head = cur;
            } else {
                cur.next = new ListNode(v);
                cur = cur.next;
            }
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }
}
