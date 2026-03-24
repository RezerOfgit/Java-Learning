package com.rezero.dp;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），
 * 返回其最大和。子数组是数组中的一个连续部分。
 */
public class No53_MaximumSubarray {

    public int maxSubArray(int[] nums) {
        // 1. 定义两个变量：
        // currentSum: 记录当前的连续累计和
        // maxSum: 记录历史出现过的最大和
        int currentSum = nums[0];
        int maxSum = nums[0];

        // 2. 从第 2 个数字（索引 1）开始坐时光机往后看
        for (int i = 1; i < nums.length; i++) {

            // 3. 灵魂拷问：如果 currentSum 已经是负资产了，我是不是该抛弃它，直接从 nums[i] 重新开始？
            // 如果 currentSum 是正资产，我是不是该把它和 nums[i] 加起来？
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // 4. 每次算完当天的 currentSum，都要看看有没有打破历史最高纪录 maxSum！
            maxSum = Math.max(currentSum, maxSum);
        }
        // 5. 返回历史最高纪录
        return maxSum;
    }
}
