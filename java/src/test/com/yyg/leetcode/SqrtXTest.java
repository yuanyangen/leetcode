package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author yuanyangen
 * @date 2/7/18
 */
class SqrtXTest {
    SqrtX sqrtX = new SqrtX();

    @Test
    void testMySqrt() {
        int result = sqrtX.mySqrt1(2147395600);
        Assertions.assertEquals(0, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme