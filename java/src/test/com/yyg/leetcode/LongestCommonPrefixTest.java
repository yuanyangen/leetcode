package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author yuanyangen
 * @date 2/6/18
 */
class LongestCommonPrefixTest {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void testLongestCommonPrefix() {
        String result = longestCommonPrefix.longestCommonPrefix(new String[] {"strs", "strs123", "str"});
        Assertions.assertEquals("str", result);
    }

    @Test
    void testLongestCommonPrefix1() {
        String result = longestCommonPrefix.longestCommonPrefix(new String[] {"strs", "strs123", "213"});
        Assertions.assertEquals("", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme