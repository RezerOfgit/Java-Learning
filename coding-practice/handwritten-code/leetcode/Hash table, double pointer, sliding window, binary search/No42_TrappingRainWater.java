/**
 * LeetCode 42. 接雨水
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 */
public class No42_TrappingRainWater {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;   // 从左到右扫描时遇到的最大高度
        int rightMax = 0;  // 从右到左扫描时遇到的最大高度
        int water = 0;

        while (left < right) {
            // 哪边的最大高度较小，就处理哪边，因为该位置的存水量由较小侧决定
            if (height[left] < height[right]) {
                // 更新 leftMax，并累加当前位置的积水量
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                // 处理右边
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }
}