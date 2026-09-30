class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 分别记录每行、每列、每个 3x3 宫格中数字是否出现过
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;

                int num = c - '1';              // 将 '1'~'9' 映射到 0~8
                int boxIndex = (i / 3) * 3 + j / 3; // 计算所属宫格编号

                // 若该数字已在行、列或宫格中出现过，则数独无效
                if (row[i][num] || col[j][num] || box[boxIndex][num]) {
                    return false;
                }

                row[i][num] = true;
                col[j][num] = true;
                box[boxIndex][num] = true;
            }
        }
        return true;
    }
}