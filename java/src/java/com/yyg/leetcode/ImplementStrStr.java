package com.yyg.leetcode;

/**
 * Implement strStr().

 Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 Example 1:

 Input: haystack = "hello", needle = "ll"
 Output: 2
 Example 2:

 Input: haystack = "aaaaa", needle = "bba"
 Output: -1
 * @author yuanyangen
 * @date 2/6/18
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        int len = haystack.length();
        int needleLen = needle.length();
        for (int i = 0; i <= len - needleLen; i++) {
            if (haystack.substring(i, i + needleLen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
