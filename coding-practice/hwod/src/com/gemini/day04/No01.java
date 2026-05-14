package com.gemini.day04;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个由 1（陆地）和 0（水）组成的二维矩阵。上下左右相连的 1 算作一个岛屿。
 * 求最大的岛屿面积是多少？
 */
public class No01 {
    // 武器 1：方向罗盘（上下左右）
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int m, n;

    public static void main(String[] args) {
        // --- 假设这里有标准 I/O 读取矩阵 grid ---
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1}
        };
        m = grid.length;
        n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int maxArea = 0;

        // 1. 主循环：遍历整个地图寻找未被发现的陆地
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    // 发现新大陆！启动 DFS 测量面积，并挑战最大值
                    int currentArea = dfs(grid, i, j, visited);
                    maxArea = Math.max(maxArea, currentArea);
                }
            }
        }
        System.out.println(maxArea);
    }

    // 2. DFS 核心逻辑：从 (x, y) 开始感染四周
    static int dfs(int[][] grid, int x, int y, boolean[][] visited) {
        // 标记当前位置已走过
        visited[x][y] = true;
        int area = 1; // 自己算作 1 块面积

        // 遍历四个方向
        for (int[] dir : dirs) {
            int nx = x + dir[0];
            int ny = y + dir[1];

            // 越界检查、是陆地、且没走过，才继续往下钻
            if (nx >= 0 && nx < m && ny >= 0 && ny < n
                    && grid[nx][ny] == 1 && !visited[nx][ny]) {
                // 累加周边探索到的面积
                area += dfs(grid, nx, ny, visited);
            }
        }
        return area;
    }
}
