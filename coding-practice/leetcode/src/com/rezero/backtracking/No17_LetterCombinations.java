package com.rezero.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 */
public class No17_LetterCombinations {
    // 建立数字到字母的映射表
    private String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return res;
        backtrack(new StringBuilder(), digits, 0);
        return res;
    }

    private void backtrack(StringBuilder path, String digits, int index) {
        // 1. 终止条件：当路径长度等于输入数字长度时，找到一个完整组合
        if (index == digits.length()) {
            res.add(path.toString());
            return;
        }

        // 2. 获取当前数字对应的字母集
        String letters = map[digits.charAt(index) - '0'];

        // 3. 遍历当前字母集，尝试每一个字母
        for (int i = 0; i < letters.length(); i++) {
            char c = letters.charAt(i);
            path.append(c);// 1.把字符c加入path
            backtrack(path, digits, index + 1);// 2.递归处理下一个index
            path.deleteCharAt(path.length() - 1);// 3.回溯（把c删掉）
        }
    }
}
