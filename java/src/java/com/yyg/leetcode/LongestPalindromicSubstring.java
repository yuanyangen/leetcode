package com.yyg.leetcode;

/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.

Example:

Input: "cbbd"

Output: "bb"

 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        byte[] bytes = s.getBytes();
        String ret = "";
        int curLen = 0;
        int length = s.length();
        for (int i = 1; i< length-1; i++) {
            for (int j =1; j <= i && j <= length -1 -i; j++ ) {
                if  (bytes[i-j] != bytes[i+j]) {
                    break;
                } else {
                    if (j >curLen) {
                        ret = s.substring(i-j, i+j+1);
                        curLen = j;
                    }
                }
            }
        }
        return ret;
    }
}
