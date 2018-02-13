package com.yyg.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * @author yuanyangen
 * @date 2/6/18
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String last = strs[0];
        for (int i = 1; i < strs.length; i++) {
            last = get(last, strs[i]);
        }
        return last;
    }

    private String get(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int minLen = str1.length() > str2.length() ? str2.length() : str1.length();
        for (int i = 0; i < minLen; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                break;
            }
            sb.append(str1.charAt(i));
        }
        return sb.toString();
    }
}
