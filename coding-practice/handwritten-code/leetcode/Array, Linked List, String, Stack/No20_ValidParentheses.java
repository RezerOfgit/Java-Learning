/**
 * LeetCode 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s，判断字符串是否有效。
 * 有效字符串需满足：
 * 1. 左括号必须用相同类型的右括号闭合。
 * 2. 左括号必须以正确的顺序闭合。
 * 3. 每个右括号都有一个对应的相同类型的左括号。
 */
public class No20_ValidParentheses {
    public boolean isValid(String s) {
        // 使用栈来匹配括号，推荐用 Deque 代替 Stack
        Deque<Character> stack = new ArrayDeque<>();

        // 遍历字符串中的每个字符
        for (char c : s.toCharArray()) {
            // 如果是左括号，将对应的右括号入栈（技巧：入栈的是预期匹配的右括号）
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else {
                // 如果是右括号，检查栈是否为空 或 栈顶元素是否等于该右括号
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        // 最后栈必须为空，说明所有左括号都被正确匹配了
        return stack.isEmpty();
    }
}