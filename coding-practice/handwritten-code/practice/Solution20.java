class Solution {
    public boolean isValid(String s) {
        // 使用栈存储左括号
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            // 遇到左括号，入栈
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else {
                // 遇到右括号，检查栈顶是否匹配
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        // 所有括号都匹配完毕，栈应为空
        return stack.isEmpty();
    }
}