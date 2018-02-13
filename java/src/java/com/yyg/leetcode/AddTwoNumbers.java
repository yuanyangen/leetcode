package com.yyg.leetcode;

import java.util.List;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order
and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode curNode = null;
        int over = 0;
        int curl1 = 0;
        int curl2 = 0;

        while (true) {
            //先取出两个list的对应当前位，如果没有， 则认为是0
            if (l1 != null && l2 != null) {
                curl1 = l1.val;
                curl2 = l2.val;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 == null && l2 != null) {
                curl1 = 0;
                curl2 = l2.val;
                l2 = l2.next;
            } else if (l1 != null && l2 == null) {
                curl2 = 0;
                curl1 = l1.val;
                l1 = l1.next;
            } else {
                break;
            }

            //根据两个值和进位相加，得到目标值和进位
            int cur = 0;
            if (curl1 + curl2 + over >= 10) {
                cur = curl1 + curl2 + over - 10;
                over = 1;
            } else {
                cur = curl1 + curl2 + over;
                over = 0;
            }

            //生成目标队列
            if (head == null) {
                curNode = new ListNode(cur);
                head = curNode;
            } else {
                curNode.next = new ListNode(cur);
                curNode = curNode.next;
            }
        }

        //如果最后有进位，补上进位
        if (over == 1) {
            curNode.next = new ListNode(1);
        }

        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
