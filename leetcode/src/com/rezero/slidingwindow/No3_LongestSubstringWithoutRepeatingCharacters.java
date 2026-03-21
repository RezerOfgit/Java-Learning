package com.rezero.slidingwindow;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。
 */
public class No3_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        // 1. 准备查重字典
        Set<Character> set = new HashSet<>();
        // 2. 准备左右窗帘和最大长度记录
        int left = 0;
        int right = 0;
        int maxLength = 0;

        // 3. 右窗帘一直往右拉，直到拉到字符串尽头
        while (right < s.length()) {
            char currentChar = s.charAt(right);

            // 4. 如果遇到重复的字符了，左窗帘就要开始往右拉，剔除历史字符，直到没有重复为止
            while (set.contains(currentChar)) {
                // 删除左指针字符并右移左指针
                set.remove(s.charAt(left));
                left++;
            }

            // 5. 现在窗口里肯定没有重复字符了！
            // 把当前字符加进 set
            set.add(currentChar);

            // 计算当前窗口长度，并更新最大长度 maxLength
            maxLength = Math.max(maxLength, right - left + 1);

            // 右窗帘继续往右探寻下一个字符
            right++;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        No3_LongestSubstringWithoutRepeatingCharacters solution = new No3_LongestSubstringWithoutRepeatingCharacters();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(solution.lengthOfLongestSubstring(""));        // 0
    }

}
