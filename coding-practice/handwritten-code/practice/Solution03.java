class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap 记录每个字符最后出现的位置
        Map<Character, Integer> lastIndex = new HashMap<>();
        int maxLength = 0;
        int left = 0; // 滑动窗口左边界

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            // 如果字符已存在且其位置在窗口内，移动左边界到重复字符的下一个位置
            if (lastIndex.containsKey(c) && lastIndex.get(c) >= left) {
                left = lastIndex.get(c) + 1;
            }
            // 更新字符的最新位置
            lastIndex.put(c, right);
            // 计算当前窗口长度，更新最大值
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}