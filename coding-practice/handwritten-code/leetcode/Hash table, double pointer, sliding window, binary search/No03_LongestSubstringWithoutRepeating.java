/**
 * LeetCode 3. 无重复字符的最长子串
 * 给定一个字符串 s，请你找出其中不含有重复字符的最长子串的长度。
 */
public class No03_LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // 用 HashMap 存储字符最近一次出现的下标 + 1，即下一次无重复的起始位置候选
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0; // 滑动窗口左边界

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            // 如果字符已存在，且其位置在 left 之后，则移动左边界到该字符上次出现位置的下一个
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            // 更新当前字符的最新位置
            map.put(c, right);
            // 窗口大小为 right - left + 1
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}