/**
 * LeetCode 54. 螺旋矩阵
 * 给你一个 m 行 n 列的矩阵 matrix，请按照顺时针螺旋顺序，
 * 返回矩阵中的所有元素。
 */
public class No54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int total = matrix.length * matrix[0].length;

        while (result.size() < total) {
            // 从左到右遍历上边界
            for (int j = left; j <= right && result.size() < total; j++) {
                result.add(matrix[top][j]);
            }
            top++; // 上边界下移

            // 从上到下遍历右边界
            for (int i = top; i <= bottom && result.size() < total; i++) {
                result.add(matrix[i][right]);
            }
            right--; // 右边界左移

            // 从右到左遍历下边界
            for (int j = right; j >= left && result.size() < total; j--) {
                result.add(matrix[bottom][j]);
            }
            bottom--; // 下边界上移

            // 从下到上遍历左边界
            for (int i = bottom; i >= top && result.size() < total; i--) {
                result.add(matrix[i][left]);
            }
            left++; // 左边界右移
        }

        return result;
    }
}