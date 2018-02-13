package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author yuanyangen
 * @date 2/13/18
 */
class RemoveDuplicatesFromSortedListTest {
    RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();

    @Test
    void testDeleteDuplicates() {
        RemoveDuplicatesFromSortedList.ListNode head  = new RemoveDuplicatesFromSortedList.ListNode(1);
        head.next = new RemoveDuplicatesFromSortedList.ListNode(2);
        head.next.next = new RemoveDuplicatesFromSortedList.ListNode(2);

        RemoveDuplicatesFromSortedList.ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(head);

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme