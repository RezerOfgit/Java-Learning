package com.rezero.matrix;

/**
 * @author Re-zero
 * @version 1.0
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。
 * 该矩阵具有以下特性：
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 */
public class No240_Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int m = 0;
        int n = matrix[0].length - 1;

        while (m < matrix.length && n >= 0) {
            int curr = matrix[m][n];
            if (curr == target) {
                return true;
            } else if (curr > target) {
                n--;
            } else {
                m++;
            }
        }
        return false;
    }

    public boolean searchMatrix_my(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) return true;
            }
        }
        return false;
    }
}
