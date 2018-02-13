package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author yuanyangen
 * @date 2/7/18
 */
class LengthOfLastWordTest {
    LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    void testLengthOfLastWord() {
        int result = lengthOfLastWord.lengthOfLastWord("Hello World      ");
        Assertions.assertEquals(5, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme