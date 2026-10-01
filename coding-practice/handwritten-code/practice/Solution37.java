class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board);
    }

    private boolean backtrack(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') continue;

                // 尝试填入 '1' ~ '9'
                for (char c = '1'; c <= '9'; c++) {
                    if (isValid(board, i, j, c)) {
                        board[i][j] = c;             // 做选择
                        if (backtrack(board)) {      // 递归求解
                            return true;             // 找到解，逐层返回
                        }
                        board[i][j] = '.';           // 撤销选择（回溯）
                    }
                }
                // 9 个数字都试过了仍无解，说明前面的选择有误
                return false;
            }
        }
        // 所有格子都已填满，求解完成
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int k = 0; k < 9; k++) {
            // 检查行
            if (board[row][k] == c) return false;
            // 检查列
            if (board[k][col] == c) return false;
            // 检查 3x3 宫格
            int boxRow = (row / 3) * 3 + k / 3;
            int boxCol = (col / 3) * 3 + k % 3;
            if (board[boxRow][boxCol] == c) return false;
        }
        return true;
    }
}