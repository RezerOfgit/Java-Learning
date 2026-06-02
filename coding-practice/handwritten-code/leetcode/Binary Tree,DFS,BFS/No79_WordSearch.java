/**
 * LeetCode 79. 单词搜索
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word。
 * 如果 word 存在于网格中，返回 true；否则，返回 false。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，
 * 其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。
 * 同一个单元格内的字母不允许被重复使用。
 */
public class No79_WordSearch {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null || word.length() == 0) {
            return false;
        }

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (backtrack(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, String word, int i, int j, int index) {
        // 如果 index 已经走到单词末尾，说明全部匹配成功
        if (index == word.length()) {
            return true;
        }

        // 越界 或 当前字符不匹配，回溯
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || board[i][j] != word.charAt(index)) {
            return false;
        }

        // 标记当前格子为已访问（用一个特殊字符占位）
        char temp = board[i][j];
        board[i][j] = '#'; // 避免重复使用

        // 向四个方向递归探索
        boolean found = backtrack(board, word, i - 1, j, index + 1)
                     || backtrack(board, word, i + 1, j, index + 1)
                     || backtrack(board, word, i, j - 1, index + 1)
                     || backtrack(board, word, i, j + 1, index + 1);

        // 恢复当前格子（回溯的关键）
        board[i][j] = temp;

        return found;
    }
}