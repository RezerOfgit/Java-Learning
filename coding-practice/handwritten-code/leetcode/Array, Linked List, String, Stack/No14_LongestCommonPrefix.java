/**
 * LeetCode 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class No14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // 将第一个字符串作为基准
        String prefix = strs[0];

        // 遍历后续每个字符串，不断缩减 prefix
        for (int i = 1; i < strs.length; i++) {
            // 如果当前字符串不以 prefix 开头，就不断截掉 prefix 的最后一个字符
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // 如果 prefix 被剪成空串，直接返回 ""
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}