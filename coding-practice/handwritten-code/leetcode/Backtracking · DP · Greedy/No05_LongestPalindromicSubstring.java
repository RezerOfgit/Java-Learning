/**
 * LeetCode 5. 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
 */
public class No05_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0; // 最长回文子串的起始下标
        int maxLen = 1; // 最长回文子串的长度（至少为1）

        for (int i = 0; i < s.length(); i++) {
            // 以 i 为中心的回文串（奇数长度）
            int len1 = expandAroundCenter(s, i, i);
            // 以 i 和 i+1 为中心的回文串（偶数长度）
            int len2 = expandAroundCenter(s, i, i + 1);
            // 取两者中较长的
            int len = Math.max(len1, len2);

            // 更新最长回文子串的起始位置和长度
            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2; // 通过中心和长度计算起始位置
            }
        }

        return s.substring(start, start + maxLen);
    }

    // 中心扩展法：给定左右边界，向两边扩展直到不再是回文
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // 循环退出时，left 和 right 已经越界或不相等，
        // 回文串的长度为 right - left - 1
        return right - left - 1;
    }
}