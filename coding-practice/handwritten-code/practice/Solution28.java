class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int n = haystack.length(), m = needle.length();
        if (n < m) return -1;

        // 1. 构建 next 数组（前缀表，记录最长相等前后缀长度）
        int[] next = new int[m];
        for (int i = 1, j = 0; i < m; i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                j = next[j - 1]; // 回退
            }
            if (needle.charAt(i) == needle.charAt(j)) {
                j++;
            }
            next[i] = j;
        }

        // 2. 用 next 数组进行匹配
        for (int i = 0, j = 0; i < n; i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = next[j - 1]; // 失配时回退 j
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i - m + 1; // 匹配成功，返回起始下标
            }
        }
        return -1;
    }
}