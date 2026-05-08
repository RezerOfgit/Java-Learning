package com.gemini.day01;

/**
 * @author Re-zero
 * @version 1.0
 * 题目 2：求满足条件的最长子串的长度（滑动窗口+字符串）
 * 题目描述： 给定一个字符串，只包含字母和数字，按要求找出最长子串的长度。
 * 要求：1. 满足条件的子串中最多只能包含一个字母（可以没有字母）；
 * 2. 必须包含至少一个数字。
 * 输入： abC124ACb
 * 输出： 4 （解释：最长符合要求的子串是 C124 或 124A）
 * 破题核心思路： 典型的双指针/滑动窗口。左指针不动，右指针向右扩展，一旦窗口内字母数量超过 1 个，
 * 左指针就开始收缩，直到字母数量恢复合规。每次合规时记录最大长度。
 */
public class No02 {
    public static int longestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        int left = 0;
        int letterCount = 0; // 当前窗口中字母的数量
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (Character.isLetter(c)) {
                letterCount++;
            }

            // 如果字母数超过1，收缩左边界
            while (letterCount > 1) {
                char leftChar = s.charAt(left);
                if (Character.isLetter(leftChar)) {
                    letterCount--;
                }
                left++;
            }

            // 窗口合法：最多1个字母，且至少包含1个数字
            if (letterCount <= 1 && containsDigit(s, left, right)) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }

    // 辅助函数：判断子串 s[left...right] 是否包含至少一个数字
    private static boolean containsDigit(String s, int left, int right) {
        for (int i = left; i <= right; i++) {
            if (Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String input = "abC124ACb";
        System.out.println(longestSubstring(input)); // 输出: 4
    }
}
