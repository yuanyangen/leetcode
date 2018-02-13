package com.yyg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanyangen
 * @date 2/13/18
 */
public class SymmetricTree {
    private List<Integer> left = new ArrayList<>();
    private List<Integer> right = new ArrayList<>();
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        addLeft(root);
        addright(root);
        return compareList();

    }
    private boolean compareList() {
        int lenLeft = left.size();
        int lenRight = right.size();
        if (lenLeft != lenRight) {
            return false;
        }
        for (int i =0; i < lenLeft; i++) {
            if (left.get(i) == null && right.get(i) == null) {
                continue;
            } else if (left.get(i) != null && left.get(i).equals(right.get(i))) {
                continue;
            } else  {
                return false;
            }
        }
        return true;
    }

    private void addLeft(TreeNode node) {
        if (node == null) {
            left.add(null);
        } else {
            addLeft(node.left);
            addLeft(node.right);
            left.add(node.val);
        }
    }

    private void addright(TreeNode node) {
        if (node == null) {
            right.add(null);
        } else {
            addright(node.right);
            addright(node.left);
            right.add(node.val);
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
