/**
 * LeetCode 53. 最大子数组和
 * 给定一个整数数组 nums，找出一个具有最大和的连续子数组（子数组最少包含一个元素），
 * 返回其最大和。
 */
public class No53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int currentMax = nums[0]; // 以当前元素结尾的最大子数组和
        int globalMax = nums[0];  // 全局最大子数组和

        for (int i = 1; i < nums.length; i++) {
            // 要么接在前面的子数组后面，要么自己独立成一段
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            // 更新全局最大值
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }
}