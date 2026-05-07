package com.rezero.array;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0)
 * 和 (i, height[i]) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。
 * 说明：你不能倾斜容器。
 */
public class No11_ContainerWithMostWater {

    public int maxArea_m2(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int h = Math.min(height[i], height[j]);
                int l = j - i;
                max = Math.max(max, h * l);
            }
        }
        return max;
    }

    public int maxArea(int[] height) {
        // 1. 定义左右双指针，分别指向最左端和最右端
        int left = 0;
        int right = height.length - 1;

        // 记录历史最大水量
        int maxWater = 0;

        // 2. 两人相向而行，直到相遇
        while (left < right) {
            // 计算当前的宽度
            int width = right - left;

            // 3. 计算当前的水量，并更新 maxWater
            int minHeight = Math.min(height[left], height[right]);
            maxWater = Math.max(maxWater, minHeight * width);

            // 4. 核心贪心移动逻辑：谁短，谁就往中间走一步，去寻找更高的可能！
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
