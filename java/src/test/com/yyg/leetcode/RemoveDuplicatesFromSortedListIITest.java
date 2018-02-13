package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author yuanyangen
 * @date 2/13/18
 */
class RemoveDuplicatesFromSortedListIITest {
    RemoveDuplicatesFromSortedListII removeDuplicatesFromSortedListII = new RemoveDuplicatesFromSortedListII();

    @Test
    void testDeleteDuplicates() {
        RemoveDuplicatesFromSortedListII.ListNode head  = new RemoveDuplicatesFromSortedListII.ListNode(1);
        head.next = new RemoveDuplicatesFromSortedListII.ListNode(2);
        head.next.next = new RemoveDuplicatesFromSortedListII.ListNode(3);
        head.next.next.next = new RemoveDuplicatesFromSortedListII.ListNode(3);
        head.next.next.next.next = new RemoveDuplicatesFromSortedListII.ListNode(4);
        head.next.next.next.next.next = new RemoveDuplicatesFromSortedListII.ListNode(4);
        head.next.next.next.next.next.next = new RemoveDuplicatesFromSortedListII.ListNode(5);

        RemoveDuplicatesFromSortedListII.ListNode result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
    }
    @Test
    void testDeleteDuplicates1() {
        RemoveDuplicatesFromSortedListII.ListNode head  = new RemoveDuplicatesFromSortedListII.ListNode(1);
        head.next = new RemoveDuplicatesFromSortedListII.ListNode(1);

        RemoveDuplicatesFromSortedListII.ListNode result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme