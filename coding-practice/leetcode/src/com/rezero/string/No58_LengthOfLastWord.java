package com.rezero.string;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。
 * 返回字符串中 最后一个 单词的长度。
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 */
public class No58_LengthOfLastWord {

    public int lengthOfLastWord_3(String s) {
        int length = 0;
        // 从字符串末尾开始往前走
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++; // 遇到字母，长度 + 1
            } else if (length > 0) {
                // 如果遇到了空格，并且之前已经数过字母了，说明最后一个单词结束了！
                return length;
            }
        }
        return length; // 防止字符串里只有单词没有空格的情况（比如 "Hello"）
    }

    public int lengthOfLastWord_2(String s) {
        String[] split = s.split("\\ +");
        return split[split.length - 1].length();
    }

    //1. 解法一 库函数
    public int lengthOfLastWord(String s) {
        //使用 trim() 方法去除字符串首尾的所有空格
        if (s == null || s.isEmpty() || s.trim().isEmpty()) {
            return 0;
        }
        //使用 split("\\s+") 方法按一个或多个空格将字符串分割成单词数组。
        // \\s+ 是一个正则表达式，表示一个或多个空白字符（包括空格、制表符等）。
        String[] words = s.trim().split("\\s+");
        return words[words.length - 1].length();
    }

    //2. 解法二 双指针
    public int TwoPointers(String s) {
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

    public static void main(String[] args) {
        No58_LengthOfLastWord solution = new No58_LengthOfLastWord();
        String s = "hello";
        int a = solution.lengthOfLastWord(s);
        int b = solution.TwoPointers(s);
        int c = solution.lengthOfLastWord_2(s);
        int d = solution.lengthOfLastWord_3(s);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
