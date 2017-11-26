package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {
    TwoSum twoSum = new TwoSum();

    @Test
    void testTwoSum() {
        int[] result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assertions.assertEquals(result[0], 0);
        Assertions.assertEquals(result[1], 1);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme