package com.rezero.array;

import java.util.HashMap;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
 * 子数组是数组中元素的连续非空序列。
 */

public class No560_SubarraySum {
    public int subarraySum(int[] nums, int k) {
        // map 记录：<前缀和, 该前缀和出现的次数>
        HashMap<Integer, Integer> preSumMap = new HashMap<>();

        // base case：前缀和为 0 的情况，默认出现了 1 次（代表什么都不选的时候和为 0）
        preSumMap.put(0, 1);

        int count = 0; // 记录满足条件的子数组个数
        int preSum = 0; // 记录当前的累计前缀和

        for (int num : nums) {
            // 1. 累计当前的前缀和
            preSum += num;

            // 2. 核心逻辑：检查 HashMap 中是否曾经出现过 preSum - k
            int target = preSum - k;
            if (preSumMap.containsKey(target)) {
                // 如果出现过，说明找到了一段和为 k 的子数组，累加它的出现次数
                count += preSumMap.getOrDefault(target, 0);
            }

            // 3. 把当前的前缀和 preSum 存入 map 中（如果已存在则次数 +1，不存在则记为 1）
            preSumMap.put(preSum, preSumMap.getOrDefault(preSum, 0) + 1);
        }

        return count;
    }
}
