package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {
    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    void testAddTwoNumbers() {
        AddTwoNumbers.ListNode l1 =new AddTwoNumbers.ListNode(2);
        l1.next = new AddTwoNumbers.ListNode(4);
        l1.next.next = new AddTwoNumbers.ListNode(3);
        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5);
        l2.next = new AddTwoNumbers.ListNode(6);
        l2.next.next =  new AddTwoNumbers.ListNode(4);

        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        Assertions.assertEquals(result.val,7);
        Assertions.assertEquals(result.next.val,0);
        Assertions.assertEquals(result.next.next.val,8);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme