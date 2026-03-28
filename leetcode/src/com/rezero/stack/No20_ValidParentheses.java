package com.rezero.stack;

import java.util.Stack;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，
 * 判断字符串是否有效。有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 */
public class No20_ValidParentheses {
    public boolean isValid(String s) {
        // 1. 创建一个空栈
        Stack<Character> stack = new Stack<>();

        // 2. 将字符串转换为字符数组并遍历
        for (char c : s.toCharArray()) {
            // 3. 如果是左括号，压入栈中
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // 4. 如果是右括号，开始检查
            else {
                // 如果栈已经空了，说明右括号多出来了，比如 "())"
                if (stack.isEmpty()) {
                    return false;
                }

                // 拿到栈顶的左括号（弹出来）
                char top = stack.pop();

                // 5. 核心判断：如果现在的右括号 c 和刚弹出来的左括号 top 不匹配，就返回 false
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;


            }
        }

        // 6. 遍历结束后，如果栈空了，说明全部匹配成功；如果栈里还有左括号（比如 "((()"），说明无效。
        return stack.isEmpty();
    }

    public boolean isValid_m2(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // 遇到左括号，就把对应的右括号压入栈中
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            }
            // 遇到右括号了！
            // 1. 如果栈空了 (说明没有多余的右括号)
            // 2. 如果弹出来的“期望右括号” 和当前的 c 不相等！
            else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        No20_ValidParentheses solution = new No20_ValidParentheses();
        String s = "()";
        System.out.println(solution.isValid(s));
        System.out.println(solution.isValid_m2(s));
    }
}
