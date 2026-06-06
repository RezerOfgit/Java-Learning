/**
 * LeetCode 198. 打家劫舍
 * 你是一个专业的小偷，计划偷窃沿街的房屋。
 * 每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你不触动警报装置的情况下，
 * 一夜之内能够偷窃到的最高金额。
 */
public class No198_HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        // dp[i] 表示考虑前 i 间房屋能偷到的最高金额
        // 空间优化后只需要两个变量
        int prev2 = nums[0];                      // dp[0]
        int prev1 = Math.max(nums[0], nums[1]);    // dp[1]

        for (int i = 2; i < nums.length; i++) {
            // 当前房屋选择偷：prev2 + nums[i]
            // 当前房屋选择不偷：prev1
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}