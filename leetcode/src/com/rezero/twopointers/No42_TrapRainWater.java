package com.rezero.twopointers;

/**
 * @author Re-zero
 * @version 1.0
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 */
public class No42_TrapRainWater {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (left < right) {
            // 1. 刷新左右两边的历史最高墙
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            // 2. 谁矮，谁就有了“确定性”，计算它的水并移动指针
            if (height[left] < height[right]) {
                water += (leftMax - height[left]);
                left++;

            } else {
                water += (rightMax - height[right]);
                right--;

            }
        }
        return water;
    }
}
