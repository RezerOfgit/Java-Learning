class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;
        if (s.length() < totalLen) return result;

        // 目标词频表
        Map<String, Integer> target = new HashMap<>();
        for (String w : words) {
            target.put(w, target.getOrDefault(w, 0) + 1);
        }

        // 枚举起始偏移量（0 ~ wordLen-1），每个偏移量做一次滑动窗口
        for (int i = 0; i < wordLen; i++) {
            int left = i, right = i;
            Map<String, Integer> window = new HashMap<>();
            int matched = 0; // 已匹配的单词数

            while (right + wordLen <= s.length()) {
                // 右侧扩窗：取一个单词
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (target.containsKey(word)) {
                    window.put(word, window.getOrDefault(word, 0) + 1);
                    matched++;

                    // 当前单词超量，左指针收缩直到不超过目标词频
                    while (window.get(word) > target.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        matched--;
                        left += wordLen;
                    }

                    // 匹配到所有单词，记录起始下标
                    if (matched == wordCount) {
                        result.add(left);
                        // 左指针右移一个单词，继续寻找下一个可能的答案
                        String leftWord = s.substring(left, left + wordLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        matched--;
                        left += wordLen;
                    }
                } else {
                    // 出现无效单词，窗口重置
                    window.clear();
                    matched = 0;
                    left = right;
                }
            }
        }
        return result;
    }
}