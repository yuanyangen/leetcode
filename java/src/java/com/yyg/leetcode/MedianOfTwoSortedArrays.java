package com.yyg.leetcode;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i = 0;
        int j = 0;

        boolean isOdd = (len1 + len2) % 2 == 0;
        int midPos = (len1 + len2) / 2;
        int curPos = 0;
        Integer last = null;
        Integer cur = null;
        while (true) {
            last = cur;
            Integer cur1 = len1 > i ? nums1[i] : null;
            Integer cur2 = len2 > j ? nums2[j] : null;
            if (cur1 != null && cur2 != null) {
                if (cur1 > cur2) {
                    cur = cur2;
                    j++;
                } else {
                    cur = cur1;
                    i++;
                }
            } else if (cur1 == null && cur2 != null) {
                cur = cur2;
                j++;
            } else if(cur1 != null && cur2 == null) {
                cur = cur1;
                i++;
            } else {
                break;
            }
            if (curPos == midPos && isOdd) {
                return (cur + last)/2.0;
            }
            if (!isOdd && curPos == midPos) {
                return cur;
            }
            curPos ++;
        }
        return 0.0;
    }
}
