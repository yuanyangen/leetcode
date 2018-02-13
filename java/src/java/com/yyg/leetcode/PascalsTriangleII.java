package com.yyg.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 杨辉三角
 * @author yuanyangen
 * @date 2/13/18
 */
public class PascalsTriangleII {
    public List<Integer> generate(int rowIndex) {
        if (rowIndex < 0) {
            return new ArrayList<>();
        }
        //这个是为了适配题意
        rowIndex++;
        List<Integer> thisRow = new ArrayList<>(rowIndex);
        for ( int i = 0; i < rowIndex; i++) {
            thisRow.add(1);
        }
        for (int i =1; i <= rowIndex; i++) {
            //使用对称的另外一半数据生成当前一半的数据
            if (i > 1) {
                for (int j = 1; j < (i / 2 + i %2); j ++) {
                    thisRow.set(j, thisRow.get( i - j - 1) + thisRow.get(i -j -2));
                }
            }
        }
        //补齐另外一半
        for (int i =0 ; i < rowIndex / 2; i++) {
            thisRow.set(rowIndex - i - 1, thisRow.get(i));
        }
        return thisRow;
    }
}
