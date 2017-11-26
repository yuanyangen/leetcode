package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestPalindromicSubstringTest {
    LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    void testLongestPalindrome() {
        String result = longestPalindromicSubstring.longestPalindrome("babad");
        Assertions.assertEquals("bab", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme