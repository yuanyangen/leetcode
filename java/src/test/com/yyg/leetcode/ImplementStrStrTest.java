package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author yuanyangen
 * @date 2/6/18
 */
class ImplementStrStrTest {
    private ImplementStrStr implementStrStr = new ImplementStrStr();

    @Test
    void testStrStr() {
        int result = implementStrStr.strStr("hello", "ll");
        Assertions.assertEquals(2, result);
    }
    @Test
    void testStrSt1() {
        int result = implementStrStr.strStr("hefsgdllo", "l353");
        Assertions.assertEquals(-1, result);
    }
    @Test
    void testStrSt2() {
        int result = implementStrStr.strStr("a", "a");
        Assertions.assertEquals(-1, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme