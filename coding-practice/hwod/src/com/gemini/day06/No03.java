package com.gemini.day06;

import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个 m x n 的二维字符网格 board 和一个字符串单词 word。如果 word 存在于网格中，
 * 返回 true ；否则，返回 false 。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。
 * 同一个单元格内的字母不允许在同一次寻找中被重复使用。
 *
 * 输入格式：
 * 第一行：两个整数 m 和 n（代表矩阵的行数和列数，用空格分隔）
 * 接下来 m 行：每行是一个长度为 n 的字符串，代表矩阵的字符
 * 最后一行：目标单词 word
 *
 * 示例输入：
 *
 * 3 4
 * ABCE
 * SFCS
 * ADEE
 * ABCCED
 * 示例输出：
 *
 * true
 */
public class No03 {
    // 武器库：方向数组（上下左右）
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int m, n;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNext()) return;

        // 读取矩阵的行数和列数
        m = in.nextInt();
        n = in.nextInt();
        char[][] board = new char[m][n];

        // 读取矩阵内容
        for (int i = 0; i < m; i++) {
            String row = in.next();
            board[i] = row.toCharArray();
        }

        // 读取目标单词
        String word = in.next();
        visited = new boolean[m][n];

        // 1. 主循环：在整个矩阵中寻找单词的第一个字母
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    // 找到首字母，启动 DFS
                    // 如果找到一条完整路径，直接输出 true 并结束程序
                    if (dfs(board, word, i, j, 0)) {
                        System.out.println("true");
                        return;
                    }
                }
            }
        }

        // 如果整个矩阵找遍了都没找到，输出 false
        System.out.println("false");
    }

    // 2. DFS 核心逻辑：index 代表当前正在匹配 word 的第几个字符
    static boolean dfs(char[][] board, String word, int x, int y, int index) {
        // 终止条件：如果 index 达到了单词最后一位，说明全部匹配成功！
        if (index == word.length() - 1) {
            return true;
        }

        // 标记当前位置已走过（防止走回头路）
        visited[x][y] = true;

        // 向四个方向探索
        for (int[] dir : dirs) {
            int nx = x + dir[0];
            int ny = y + dir[1];

            // 边界检查 && 没走过 && 恰好等于我们要找的下一个字符
            if (nx >= 0 && nx < m && ny >= 0 && ny < n
                    && !visited[nx][ny]
                    && board[nx][ny] == word.charAt(index + 1)) {

                // 递归深入下一层
                if (dfs(board, word, nx, ny, index + 1)) {
                    return true;
                }
            }
        }

        // ⚠️ 核心：回溯！
        // 如果四个方向都走不通，说明当前这条路不对
        // 必须把状态重置为 false，这样其他路径经过这个点时还能使用它
        visited[x][y] = false;
        return false;
    }
}
