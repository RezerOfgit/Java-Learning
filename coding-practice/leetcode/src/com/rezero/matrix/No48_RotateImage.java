package com.rezero.matrix;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。
 * 请不要 使用另一个矩阵来旋转图像。
 */
public class No48_RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp = 0;
        // 1. 第一步：沿主对角线转置矩阵 (Transpose)
        for (int i = 0; i < n; i++) {
            // 注意：j 从 i 开始，只遍历对角线右侧的元素进行交换，避免重复交换变回原样
            for (int j = i; j < n; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // 2. 第二步：逐行左右反转矩阵 (Reverse each row)
        for (int i = 0; i < n; i++) {
            // 每行使用左右双指针进行翻转
            int left = 0;
            int right = n - 1;
            while (left < right) {
                temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
