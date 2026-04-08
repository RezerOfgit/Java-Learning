package com.rezero.backtracking;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，
 * 返回 true ；否则，返回 false 。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或
 * 垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 */
public class No79_WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backtrack(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, String word, int i, int j, int index) {
        // ① 越界或字符不匹配
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || board[i][j] != word.charAt(index)) {
            return false;
        }

        // ② 所有字符都匹配了
        if (index == word.length() - 1) {
            return true;
        }

        // ③ 标记已访问（原地修改，省掉 visited 数组）
        char tmp = board[i][j];
        board[i][j] = '#';

        // ④ 向上下左右四个方向搜索下一个字符
        boolean found = backtrack(board, word, i + 1, j, index + 1)  // 下
                || backtrack(board, word, i - 1, j, index + 1)  // 上
                || backtrack(board, word, i, j + 1, index + 1)  // 右
                || backtrack(board, word, i, j - 1, index + 1); // 左

        // ⑤ 恢复（回溯）
        board[i][j] = tmp;

        return found;
    }
}

