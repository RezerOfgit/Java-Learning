/**
 * LeetCode 238. 除自身以外数组的乘积
 * 给你一个整数数组 nums，返回数组 answer，
 * 其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 * 题目数据保证数组 nums 之中任意元素的全部前缀元素和后缀的乘积都在 32 位整数范围内。
 * 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 */
public class No238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // 第一遍遍历：计算每个位置左侧所有元素的乘积
        // answer[i] 先存储 i 左侧元素的乘积
        answer[0] = 1; // 最左侧元素没有左边元素，乘积为 1
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // 第二遍遍历：从右向左，乘以右侧所有元素的乘积
        int rightProduct = 1; // 当前元素右侧的乘积
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct; // 左侧乘积 × 右侧乘积
            rightProduct = rightProduct * nums[i]; // 更新右侧乘积，供下一个元素使用
        }

        return answer;
    }
}