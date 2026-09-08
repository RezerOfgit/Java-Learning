class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // 以第一个字符串为基准
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // 不断缩短 prefix，直到它是 strs[i] 的前缀
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}