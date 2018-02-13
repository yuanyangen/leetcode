package com.yyg.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author yuanyangen
 * @date 2/7/18
 */
class SearchInsertPositionTest {
    SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @Test
    void testSearchInsert() {
        int result = searchInsertPosition.searchInsert(new int[] {1,3,5,6}, 2);
        Assertions.assertEquals(1, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme