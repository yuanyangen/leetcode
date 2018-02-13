package com.yyg.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 杨辉三角
 * @author yuanyangen
 * @date 2/13/18
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> ret = new LinkedList<>();
        List<Integer> lastRow = null;
        for (int i =1; i <= numRows; i++) {
            List<Integer> thisRow = new ArrayList<>(i);
            thisRow.add(1);
            //根据上一行生成下一行
            if (i > 1) {
                for (int j = 1; j < i-1; j ++) {
                    thisRow.add(lastRow.get(j-1) + lastRow.get(j));
                }
                thisRow.add(1);
            }
            ret.add(thisRow);
            lastRow = thisRow;
        }
        return ret;
    }
}
