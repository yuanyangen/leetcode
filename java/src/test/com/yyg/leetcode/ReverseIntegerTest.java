package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {
    ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    void testReverse() {
        int result = reverseInteger.reverse(123);
        Assertions.assertEquals(321, result);
    }
    @Test
    void testReverse1() {
        int result = reverseInteger.reverse(-123);
        Assertions.assertEquals(-321, result);
    }
    @Test
    void testReverse2() {
        int result = reverseInteger.reverse(1534236469);
        Assertions.assertEquals(0, result);
    }
    @Test
    void testReverse3() {
        int result = reverseInteger.reverse(-2147483648);
        Assertions.assertEquals(0, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme