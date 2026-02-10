package com.rezero.no58;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。
 * 返回字符串中 最后一个 单词的长度。
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 */
public class WordLength {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = solution.lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(a);
    }
}
//class Solution{
//    private String s;
//
//    public int lengthOfLastWord(String s) {
//        //使用 trim() 方法去除字符串首尾的所有空格
//        if (s == null || s.isEmpty() || s.trim().isEmpty()) {
//            return 0;
//        }
//        //使用 split("\\s+") 方法按一个或多个空格将字符串分割成单词数组。
//        // \\s+ 是一个正则表达式，表示一个或多个空白字符（包括空格、制表符等）。
//        String[] words = s.trim().split("\\s+");
//        return words[words.length - 1].length();
//    }
//}
