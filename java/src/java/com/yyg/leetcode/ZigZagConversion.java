package com.yyg.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Zigzag:即循环对角线结构（

 0	 	 	 	8	 	 	 	16
 1	 	 	7	9	 	 	15	17
 2	 	6	 	10	 	14	 	18
 3	5	 	 	11	13	 	 	19
 4	 	 	 	12	 	 	 	20
 ）
 *
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

 P   A   H   N
 A P L S I I G
 Y   I   R
 And then read line by line: "PAHNAPLSIIGYIR"
 Write the code that will take a string and make this conversion given a number of rows:

 string convert(string text, int nRows);
 convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class ZigZagConversion {
    public String convert0(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        char[] bytes = s.toCharArray();
        Map<Integer, StringBuilder> result = new HashMap<>();
        for (int i =0; i <numRows; i++) {
            result.put(i, new StringBuilder());
        }
        int period = 2 * numRows - 2;
        int halfPeriod = numRows - 1;
        int times = bytes.length/period +1;
        for(int i = 0; i< times; i++) {
            if (i * period  < bytes.length ) {
                result.get(0).append(bytes[i * period]);
            }
            if (i * period + halfPeriod  < bytes.length ) {
                result.get(halfPeriod).append(bytes[i * period + halfPeriod]);
            }
            for (int j = 1; j < halfPeriod ; j++) {
                if (i * period + j < bytes.length ) {
                    result.get(j).append(bytes[i * period + j]);
                }
                if ((i +1) * period - j < bytes.length) {
                    result.get(j).append(bytes[(i + 1) * period - j]);
                }
            }
        }
        for (int i =1; i <numRows; i++) {
            result.get(0).append(result.get(i));
        }
        return result.get(0).toString();
    }

    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        char[] bytes = s.toCharArray();
        StringBuilder res = new StringBuilder();
        int period = 2 * numRows - 2;
        int halfPeriod = numRows - 1;
        int times = bytes.length/period +1;
        for(int i = 0; i< times; i++) {
            if (i * period  < bytes.length ) {
                res.append(bytes[i * period]);
            }
        }
        for (int j = 1; j < halfPeriod; j++) {
            for(int i = 0; i< times; i++) {
                if (i * period +j  < bytes.length ) {
                    res.append(bytes[i * period + j]);
                }
                if ((i +1) * period - j  < bytes.length ) {
                    res.append(bytes[(i+ 1) * period - j]);
                }

            }
        }

        for(int i = 0; i< times; i++) {
            if (i * period + halfPeriod < bytes.length ) {
                res.append(bytes[i * period + halfPeriod ]);
            }
        }
        return res.toString();
    }

}
