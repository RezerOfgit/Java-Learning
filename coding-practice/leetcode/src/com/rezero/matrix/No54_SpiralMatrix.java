package com.rezero.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 */
public class No54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (true) {
            // 1. 向右走：从 left 到 right
            for (int i = left; i <= right; i++) res.add(matrix[top][i]);
            if (++top > bottom) break; // 上边界下移，若交错则结束

            // 2. 向下走：从 top 到 bottom
            for (int i = top; i <= bottom; i++) res.add(matrix[i][right]);
            if (--right < left) break;

            // 3. 向左走：从 right 到 left
            for (int i = right; i >= left; i--) res.add(matrix[bottom][i]);
            if (--bottom < top) break;

            // 4. 向上走：从 bottom 到 top
            for (int i = bottom; i >= top; i--) res.add(matrix[i][left]);
            if (++left > right) break;
        }
        return res;
    }
}
