package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MedianOfTwoSortedArraysTest {
    MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();

    @Test
    void testFindMedianSortedArrays() {
        double result = medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1,3}, new int[]{2});
        Assertions.assertEquals(2.0d, result);
    }
    @Test
    void testFindMedianSortedArrays1() {
        double result = medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4});
        Assertions.assertEquals(2.5d, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme