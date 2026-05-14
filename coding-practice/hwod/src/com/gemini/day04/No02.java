package com.gemini.day04;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个二维网格，0 表示路，1 表示墙。你从左上角 (0, 0) 出发，
 * 要走到右下角 (m-1, n-1)。每一步只能上下左右走。求最短需要几步？如果走不到，返回 -1。
 */
public class No02 {
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        // 0 表示能走的路，1 表示墙壁。从左上角走到右下角。
        int[][] grid = {
                {0, 0, 1, 0},
                {1, 0, 1, 0},
                {1, 0, 0, 0},
                {1, 1, 1, 0}
        };
        System.out.println(bfsShortestPath(grid));
    }

    static int bfsShortestPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // 如果起点或终点被堵死了，直接不用玩了
        if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1) return -1;

        boolean[][] visited = new boolean[m][n];
        // 队列里存放的是坐标数组 [x, y]
        Queue<int[]> queue = new LinkedList<>();

        // 起点入队
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        int steps = 0; // 记录走了几步

        while (!queue.isEmpty()) {
            // ⚠️ 极其核心：取出当前队列的大小，代表“这一圈”有几个节点
            int size = queue.size();

            // 一次性把这一圈的节点全部处理完
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int x = curr[0];
                int y = curr[1];

                // 走到终点啦！直接返回当前步数
                if (x == m - 1 && y == n - 1) {
                    return steps;
                }

                // 向四个方向扩散探路
                for (int[] dir : dirs) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];

                    // 没有越界、是合法的路(0)、且没走过
                    if (nx >= 0 && nx < m && ny >= 0 && ny < n
                            && grid[nx][ny] == 0 && !visited[nx][ny]) {
                        queue.offer(new int[]{nx, ny}); // 下一步的位置入队
                        visited[nx][ny] = true;         // 走过的地方立刻插眼，防止重复走
                    }
                }
            }
            // 这一圈的节点都向外扩散完了，总步数才 +1
            steps++;
        }

        return -1; // 队列空了都没找到终点，说明死路一条
    }
}