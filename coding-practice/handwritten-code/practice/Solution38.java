class Solution {
    public String countAndSay(int n) {
        // 初始项
        String result = "1";

        // 从第 2 项开始，迭代生成到第 n 项
        for (int i = 2; i <= n; i++) {
            StringBuilder next = new StringBuilder();
            int count = 1;

            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++; // 连续相同字符，计数累加
                } else {
                    // 遇到不同字符，先输出前一段的"个数+数字"
                    next.append(count).append(result.charAt(j - 1));
                    count = 1; // 重置计数
                }
            }
            // 处理最后一段
            next.append(count).append(result.charAt(result.length() - 1));
            result = next.toString();
        }

        return result;
    }
}