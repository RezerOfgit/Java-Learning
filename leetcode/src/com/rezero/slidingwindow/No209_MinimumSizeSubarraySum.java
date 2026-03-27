package com.rezero.slidingwindow;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个含有 n 个正整数的数组和一个正整数 target。找出该数组中满足其和 >= target
 * 的长度最小的 连续子数组，并返回其长度。如果不存在符合条件的子数组，返回 0。
 * 输入: target = 7, nums = [2,3,1,2,4,3]
 * 输出: 2 (子数组 [4,3] 是该条件下的长度最小的子数组)
 */
public class No209_MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        // 初始化为一个极大的不可能的值，方便后续打擂台找最小值
        int minLength = Integer.MAX_VALUE;

        // 右指针主动扩张
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // 把右边的数字吞进来

            // 核心逻辑：一旦总和达标，开始尝试缩小窗口！
            while (sum >= target) {
                // 1. 打擂台：更新历史出现过的最短长度 minLength
                minLength = Math.min(minLength, right - left + 1);

                // 2. 左指针收缩：把左边界的数字吐出来，然后 left 往前走一步
                sum -= nums[left];
                left++;
            }
        }

        // 如果 minLength 还是初始值，说明根本没找到，返回 0
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
