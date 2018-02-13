package com.yyg.leetcode;

/**
 * @author yuanyangen
 * @date 2/6/18
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int ret = 0;
        int lastIndex = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != val) {
                nums[lastIndex] = nums[i];
                lastIndex++;
                ret ++;
            }
        }
        return ret;
    }
}
