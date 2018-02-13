package com.yyg.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 将元素写入到stack中， 如果stack中的元素最终为空，表明合法

 * @author yuanyangen
 * @date 2/6/18
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character,Character> chars = new HashMap<>();
        chars.put('(', ')');
        chars.put('[', ']');
        chars.put('{', '}');
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i =0; i < len; i++) {
            if (!stack.isEmpty()) {
                Character c =  stack.pop();
                if (chars.get(c) == null) {
                    return false;
                }
                if (!chars.get(c).equals(s.charAt(i))) {
                    stack.push(c);
                    stack.push(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
