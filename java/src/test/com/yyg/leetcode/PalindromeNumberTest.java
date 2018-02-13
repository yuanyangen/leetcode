package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author yuanyangen
 * @date 2/6/18
 */
class PalindromeNumberTest {
    PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void testIsPalindrome() {
        boolean result = palindromeNumber.isPalindrome(1221);
        Assertions.assertEquals(true, result);
    }
       @Test
    void testIsPalindrome1() {
        boolean result = palindromeNumber.isPalindrome(-2147447412);
        Assertions.assertEquals(true, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme