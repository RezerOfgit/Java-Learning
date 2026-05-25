/**
 * LeetCode 58. 最后一个单词的长度
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。
 * 返回字符串中最后一个单词的长度。
 * 单词是指仅由字母组成、不包含任何空格字符的最大子字符串。
 */
public class No58_LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // 从后往前找第一个非空格字符，作为最后一个单词的结束位置
        int end = s.length() - 1;

        // 跳过末尾的空格
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        // 如果整个字符串全是空格（根据题意不会出现，但防御性编程）
        if (end < 0) {
            return 0;
        }

        // 从 end 继续向左数，直到遇到空格或字符串开头
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }

        // 长度为 end - start
        return end - start;
    }
}