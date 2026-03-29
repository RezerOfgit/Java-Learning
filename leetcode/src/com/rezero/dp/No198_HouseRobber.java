package com.rezero.dp;

/**
 * @author Re-zero
 * @version 1.0
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一
 * 制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，
 * 系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，
 * 一夜之内能够偷窃到的最高金额。
 */
public class No198_HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        // 1. 定义 dp 数组：dp[i] 表示偷到第 i 间房子时，能获得的最大收益
        int[] dp = new int[nums.length];

        // 2. 初始化 base case (最开始的两间房子)
        dp[0] = nums[0]; // 只有一间房，偷了完事
        dp[1] = Math.max(nums[0], nums[1]); // 有两间房，挑钱多的那一间偷

        // 3. 从第 3 间房（索引 2）开始往后推导
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i -2] + nums[i]);
        }

        // 最后返回最后一间房子的最大收益记录
        return dp[nums.length - 1];
    }
}
