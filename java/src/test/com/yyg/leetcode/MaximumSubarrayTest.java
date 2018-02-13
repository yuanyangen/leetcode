package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author yuanyangen
 * @date 2/7/18
 */
class MaximumSubarrayTest {
    MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Test
    void testMaxSubArray() {
        int result = maximumSubarray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
        Assertions.assertEquals(6, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme