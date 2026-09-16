class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder sb,
                           int open, int close, int n) {
        // 终止条件：字符串长度达到 2n
        if (sb.length() == 2 * n) {
            result.add(sb.toString());
            return;
        }

        // 若左括号数量未满，可以添加左括号
        if (open < n) {
            sb.append('(');
            backtrack(result, sb, open + 1, close, n);
            sb.deleteCharAt(sb.length() - 1); // 回溯
        }

        // 若右括号数量小于左括号，可以添加右括号
        if (close < open) {
            sb.append(')');
            backtrack(result, sb, open, close + 1, n);
            sb.deleteCharAt(sb.length() - 1); // 回溯
        }
    }
}