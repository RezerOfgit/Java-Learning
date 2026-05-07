package com.rezero.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Re-zero
 * @version 1.0
 * 在给定的 m x n 网格 grid 中，每个单元格可以有以下三个值之一：
 * 值 0 代表空单元格；
 * 值 1 代表新鲜橘子；
 * 值 2 代表腐烂的橘子。
 * 每分钟，腐烂的橘子 周围 4 个方向上相邻 的新鲜橘子都会腐烂。
 * 返回 直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1 。
 */
public class No994_RottingOranges {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;

        // 1. 初始化队列，清点新鲜橘子
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        // 基地里本来就没有新鲜橘子，直接返回 0
        if (freshCount == 0) return 0;

        int minutes = 0;
        // 定义上下左右四个方向的坐标偏移量
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // 2. 开始 BFS 扩散
        while (!queue.isEmpty() && freshCount > 0) {
            minutes++;
            int size = queue.size();

            // 处理当前这一分钟内的所有烂橘子
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];

                // 往四个方向感染
                for (int[] dir : dirs) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    // 1. 如果越界了，或者遇到的不是新鲜橘子 (grid[nr][nc] != 1)，直接 continue
                    if (nr < 0 || nr >= m || nc < 0 || nc >= n || grid[nr][nc] != 1) {
                        continue;
                    }

                    // 2. 否则，成功感染：把 grid[nr][nc] 变成烂橘子(2)，freshCount 减 1，并把新烂的橘子加入队列
                    grid[nr][nc] = 2;
                    freshCount--;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }

        // 3. 判断是否还有漏网之鱼
        return freshCount == 0 ? minutes : -1;
    }
}
