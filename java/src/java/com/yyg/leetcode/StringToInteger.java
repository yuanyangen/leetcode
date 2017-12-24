package com.yyg.leetcode;

public class StringToInteger {
    public int myAtoi(String str) {
        str = str.trim();
        char[] chars = str.toCharArray();
        int size = chars.length;
        boolean positive = true;
        int tmp = Integer.MAX_VALUE / 10;
        int tmp1 = Integer.MAX_VALUE % 10;
        if (size == 0) {
            return 0;
        }
        if (chars[0] == '-') {
            positive = false;
            chars[0] = '0';
        } else if (chars[0] == '+') {
            positive = true;
            chars[0] = '0';
        }
        int result = 0;
        for (int i = 0; i < size; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                break;
            }
            if (result > tmp || (result == tmp && chars[i] - '0' >= tmp1)) {
                result = Integer.MAX_VALUE;
                break;
            }
            result = result *10 + chars[i] - '0';
        }
        return positive ? result : - result;

    }
}
