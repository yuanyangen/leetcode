package com.yyg.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author yuanyangen
 * @date 2/13/18
 */
class MergeSortedArrayTest {
    MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    void testMerge() {
        mergeSortedArray.merge(new int[] {0}, 0, new int[] {1}, 1);
    }
    @Test
    void testMerge1() {
        mergeSortedArray.merge(new int[] {1,0}, 1, new int[] {2}, 1);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme