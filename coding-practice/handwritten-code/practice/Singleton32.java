class Solution {
    public int longestValidParentheses(String s) {
        int left = 0, right = 0;
        int maxLen = 0;

        // 1. 从左到右扫描：以右括号为界，统计有效长度
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxLen = Math.max(maxLen, 2 * right);
            } else if (right > left) {
                // 右括号多于左括号，说明当前段无效，重置
                left = 0;
                right = 0;
            }
        }

        // 2. 从右到左扫描：处理左括号多于右括号的情况（如 "(()"）
        left = 0;
        right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxLen = Math.max(maxLen, 2 * left);
            } else if (left > right) {
                left = 0;
                right = 0;
            }
        }

        return maxLen;
    }
}