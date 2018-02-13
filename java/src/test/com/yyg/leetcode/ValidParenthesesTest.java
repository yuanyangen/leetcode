package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author yuanyangen
 * @date 2/6/18
 */
class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void testIsValid() {
        boolean result = validParentheses.isValid("()[]{}");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsValid1() {
        boolean result = validParentheses.isValid("()[]{}}");
        Assertions.assertEquals(false, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme