package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringToIntegerTest {
    StringToInteger stringToInteger = new StringToInteger();

    @Test
    void testMyAtoi() {
        int result = stringToInteger.myAtoi("1435");
        Assertions.assertEquals(1435, result);
    }
    @Test
    void testMyAtoi1() {
        int result = stringToInteger.myAtoi("-1435");
        Assertions.assertEquals(-1435, result);
    }
    @Test
    void testMyAtoi2() {
        int result = stringToInteger.myAtoi("        01435");
        Assertions.assertEquals(1435, result);
    }
    @Test
    void testMyAtoi3() {
        int result = stringToInteger.myAtoi("2147483648");
        Assertions.assertEquals(2147483647, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme