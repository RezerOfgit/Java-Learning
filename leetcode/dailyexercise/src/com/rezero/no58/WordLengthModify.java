package com.rezero.no58;

/**
 * @author Re-zero
 * @version 1.0
 */
public class WordLengthModify {
}
class Solution {
    public int lengthOfLastWord(String s) {
        //1. 防御性编程：处理 null 和 空字符串
        if (s == null || s.length() == 0) {
            return 0;
        }

        int end = s.length() - 1;

        //2. 从后往前找,跳过末尾的空格
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        //如果全是空格,end 会变成 -1
        if (end < 0) return 0;

        //3. 记录单词结束的位置,继续往前找,知道遇到空格或者头部
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        //4. 计算两者距离
        return end - start;
    }
}
