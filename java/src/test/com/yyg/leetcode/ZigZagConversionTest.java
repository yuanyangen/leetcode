package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ZigZagConversionTest {
    ZigZagConversion zigZagConversion = new ZigZagConversion();

    @Test
    void testConvert() {
        String result = zigZagConversion.convert("PAYPALISHIRING", 3);
        Assertions.assertEquals("PAHNAPLSIIGYIR", result);
    }
    @Test
    void testConvert1() {
        String result = zigZagConversion.convert("ABC", 2);
        Assertions.assertEquals("ACB", result);
    }
    @Test
    void testConvert2() {
        String result = zigZagConversion.convert("ABCD", 2);
        Assertions.assertEquals("ACBD", result);
    }
    @Test
    void testConvert3() {
        String result = zigZagConversion.convert("", 1);
        Assertions.assertEquals("", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme