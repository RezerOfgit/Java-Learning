package com.rezero.graph;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * 你可以假设该网格的四条边均被水包围。
 */
public class No200_NumberOfIslands {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // 1. 地毯式搜索整个网格
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                // 2. 如果发现了 '1'，说明找到了一个新岛屿！
                if (grid[r][c] == '1') {
                    count++; // 岛屿数量加 1

                    // 3. 立刻发动 DFS 魔法，把这个岛屿和它周围连着的所有陆地全部“击沉”（变成 '0'）
                    dfs(grid, r, c);
                }
            }
        }
        return count;
    }

    // DFS 沉岛魔法函数
    private void dfs(char[][] grid, int r, int c) {
        // 1. 递归终止条件（越界保护，或者遇到了水 '0'，直接回头）
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') {
            return;
        }

        // 2. 核心动作：把当前这块陆地“击沉”（变成 '0'）
        grid[r][c] = '0';

        // 3. 顺藤摸瓜：往它的 上、下、左、右 四个方向继续发动沉岛魔法！

        // 向上走一步
        dfs(grid,r - 1, c);


        // 向下走一步
        dfs(grid,r + 1, c);

        // 向左走一步
        dfs(grid,r, c - 1);

        // 向右走一步
        dfs(grid,r, c + 1);
    }
}
