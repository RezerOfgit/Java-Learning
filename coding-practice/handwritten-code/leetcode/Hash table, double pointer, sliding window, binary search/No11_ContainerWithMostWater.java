/**
 * LeetCode 11. 盛最多水的容器
 * 给定一个长度为 n 的整数数组 height。
 * 有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i])。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。
 * 说明：你不能倾斜容器。
 */
public class No11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // 容器高度由较短的线决定，宽度为 right - left
            int currentHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int area = currentHeight * width;

            // 更新最大面积
            maxArea = Math.max(maxArea, area);

            // 移动较短的那条线，因为移动较长线不可能增加面积
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}