package com.rezero.string;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * 输入: s = "babad"
 * 输出: "bab" （"aba" 同样是符合题意的答案）
 */
//public class No5_LongestPalindromicSubstring {
//    public String longestPalindrome(String s) {
//
//        char[] chars = s.toCharArray();
//        int mid = 0;
//        int left = mid - 1;
//        int right = mid + 1;
//
//        while (chars[mid] != chars[left] && chars[mid] != chars[right]) {
//            if (chars[left] == chars[right]) {
//                left--;
//                right++;
//            }
//
//        }
//
//    }
//}
public class No5_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // 情况1：回文串长度为奇数（以 s[i] 1个字符为中心）
            int len1 = expandAroundCenter(s, i, i);
            // 情况2：回文串长度为偶数（以 s[i] 和 s[i+1] 2个字符为中心）
            int len2 = expandAroundCenter(s, i, i + 1);

            // 取两种情况里更长的那一个
            int len = Math.max(len1, len2);

            // 如果新找到的回文串比记录的更长，更新 start 和 end 坐标
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    // 辅助开发方法：从中心向两边扩展，返回能够扩展出的最大回文串的长度
    private int expandAroundCenter(String s, int left, int right) {
        // 核心实现步骤：
        // 只要 left 和 right 没有越界，并且 s.charAt(left) 和 s.charAt(right) 字符相同
        // 就让 left 往左走一步 (left--)，right 往右走一步 (right++)
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // 循环被打破时，说明遇到了不相等的字符，或者越界了。
        // 此时真实的回文串长度应该是 (right - 1) - (left + 1) + 1 = right - left - 1
        return right - left - 1;
    }
}