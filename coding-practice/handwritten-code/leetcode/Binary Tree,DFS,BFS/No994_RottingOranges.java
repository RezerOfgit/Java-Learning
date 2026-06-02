/**
 * LeetCode 994. 腐烂的橘子
 * 在给定的 m x n 网格 grid 中，每个单元格可以有以下三个值之一：
 * - 0 代表空单元格；
 * - 1 代表新鲜橘子；
 * - 2 代表腐烂的橘子。
 * 每分钟，腐烂的橘子周围 4 个方向上相邻的新鲜橘子都会腐烂。
 * 返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。
 */
public class No994_RottingOranges {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return -1;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;

        // 初始遍历：统计新鲜橘子数，腐烂橘子入队
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        // 如果没有新鲜橘子，直接返回 0
        if (freshCount == 0) {
            return 0;
        }

        int minutes = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // BFS 逐层腐烂
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rottedThisRound = false; // 本分钟是否有新腐烂

            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int r = cell[0], c = cell[1];

                for (int[] dir : directions) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];
                    // 如果邻居是新鲜橘子，则腐烂它
                    if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        freshCount--;
                        queue.offer(new int[]{nr, nc});
                        rottedThisRound = true;
                    }
                }
            }
            // 只有本层确实腐烂了橘子，分钟数才加 1
            if (rottedThisRound) {
                minutes++;
            }
        }

        // 若还有新鲜橘子剩余，返回 -1
        return freshCount == 0 ? minutes : -1;
    }
}