package com.yyg.leetcode;

/**
 * @author yuanyangen
 * @date 2/7/18
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        //认为加一是进位的一种，当最后一位的时候， 设置进位为1
        int over = 1;
        for (int i = len-1; i >=0; i--) {
            //当没有进位的时候， 认为结果已经出来
            if (over == 0) {
                 return digits;
            }
            //当前位为9 ，有进位的时候， 需要重新计算
            if (digits[i] == 9) {
                over = 1;
                digits[i] = 0;
            } else {
                digits[i] += 1;
                over = 0;
            }
        }
        //最后计算完成如果有进位，新建数组，
        if (over == 1) {
            int[] ret = new int[len +1];
            ret[0] = 1;
            System.arraycopy(digits, 0, ret, 1, len);
            return ret;
        } else {
            return digits;
        }
    }
}
