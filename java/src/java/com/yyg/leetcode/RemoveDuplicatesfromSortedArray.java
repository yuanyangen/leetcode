package com.yyg.leetcode;

/**
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

 Example:

 Given nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 It doesn't matter what you leave beyond the new length.
 因为是排好序的， 所以这个题很简单
 * @author yuanyangen
 * @date 2/6/18
 */
public class RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int ret = 1;
        int last = nums[0];
        int lastIndex = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] != last) {
                ret ++;
                nums[lastIndex] = nums[i];
                lastIndex++;
                last = nums[i];
            }
        }
        return ret;
    }
}

