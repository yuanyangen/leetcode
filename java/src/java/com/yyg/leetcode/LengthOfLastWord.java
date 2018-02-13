package com.yyg.leetcode;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 Example:

 Input: "Hello World"
 Output: 5

 * @author yuanyangen
 * @date 2/7/18
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int ret = 0;
        boolean lastEqualsSpace = true;
        for (int i = len -1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (!lastEqualsSpace) {
                    return ret;
                }
            } else {
                ret++;
                lastEqualsSpace = false;
            }
        }
        return ret;

    }
}
