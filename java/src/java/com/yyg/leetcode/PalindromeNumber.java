package com.yyg.leetcode;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 例如：
 * 12321       123321
 * 思路， 将int反转， 再比较
 * @author yuanyangen
 * @date 2/6/18
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        //负数不能是回文数
        if (x < 0) {
            return false;
        }
        int y= x;
        int target = 0;
        while (true) {
            target  = target * 10 + x % 10;
            x = x / 10;
            if (x == 0) {
                break;
            }
        }
        return target == y;
    }
}
