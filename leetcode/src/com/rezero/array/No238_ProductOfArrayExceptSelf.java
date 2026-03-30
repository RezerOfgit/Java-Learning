package com.rezero.array;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中
 * 除了 nums[i] 之外其余各元素的乘积 。
 *
 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
 * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
 */
public class No238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        // 1. 第一趟：计算每个数字【左边】所有数字的乘积
        // 第一个数字左边没有数字，所以乘积默认为 1
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            // 当前数字左边的乘积 = 前一个数字左边的乘积 * 前一个数字本身
            res[i] = res[i - 1] * nums[i - 1];
        }

        // 2. 第二趟：计算每个数字【右边】所有数字的乘积，并直接乘到 res 里
        // 最后一个数字右边没有数字，默认为 1
        int rightProduct = 1;
        // 从倒数第一个数字开始，反向遍历
        for (int i = n - 1; i >= 0; i--) {
            // 把右边的乘积乘到最终结果里
            res[i] *= rightProduct;
            // 乘完之后，更新 rightProduct，把当前数字也乘进去，供前一个数字使用
            rightProduct *= nums[i];
        }

        return res;
    }
}
