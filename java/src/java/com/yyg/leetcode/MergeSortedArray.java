package com.yyg.leetcode;

/**
 * @author yuanyangen
 * @date 2/13/18
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmpNums1 = new int[m];
        for (int i = 0; i < m; i++) {
            tmpNums1[i] = nums1[i];
        }
        for (int i = 0, j =0; i < m || j < n;) {
            if (i >= m) {
                nums1[i + j] = nums2[j];
                j++;
            } else if (j >= n) {
                nums1[i + j] = tmpNums1[i];
                i++;
            } else {
                if (tmpNums1[i] <= nums2[j]) {
                    nums1[i + j] = tmpNums1[i];
                    i++;
                } else {
                    nums1[i + j] = nums2[j];
                    j++;
                }
            }
        }
    }
}
