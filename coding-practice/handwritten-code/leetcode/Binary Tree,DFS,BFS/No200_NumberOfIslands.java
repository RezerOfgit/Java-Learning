/**
 * LeetCode 200. 岛屿数量
 * 给你一个由 '1'（陆地）和 '0'（水）组成的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * 你可以假设网格的四个边均被水包围。
 */
public class No200_NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        // 遍历网格中的每一个格子
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // 遇到陆地，岛屿数+1，并 DFS 感染整座岛
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    // DFS 将当前岛屿的所有陆地标记为已访问（改为 '0'）
    private void dfs(char[][] grid, int i, int j) {
        // 越界或碰到水则返回
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        // 将当前陆地沉没，避免重复计数
        grid[i][j] = '0';

        // 向四个方向递归
        dfs(grid, i - 1, j); // 上
        dfs(grid, i + 1, j); // 下
        dfs(grid, i, j - 1); // 左
        dfs(grid, i, j + 1); // 右
    }
}