package com.yyg.leetcode;

/**
 * @author yuanyangen
 * @date 2/7/18
 */
public class SqrtX {
    public int mySqrt(int x) {
        return (int) Math.floor(Math.sqrt(x));
    }
    public int mySqrt1(int x) {
        int i = 1;
        while (true) {

            if (i * i > x) {
                return i -1;
            }
            System.out.println(i * i);
            i++;
        }
    }
}
