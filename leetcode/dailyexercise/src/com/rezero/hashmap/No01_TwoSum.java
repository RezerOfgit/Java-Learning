package com.rezero.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Re-zero
 * @version 1.0
 * 题目描述： 给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那 两个 整数，并返回它们的数组下标。
 * 输入：nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class No01_TwoSum {

    // 解法 1：暴力枚举法 (方便记录你一开始的笨办法)
    public int[] twoSumBruteForce(int[] nums, int target) {
        //我的解法 时间复杂度 O(n^2) 代码
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + " " + j);
                    a = i;
                    b = j;
                    return new int[]{a, b};
                }
            }
        }
        return null;
    }

    // 解法 2：哈希表法 (最优解)
    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // ...  O(n) 代码
        // Map<数值, 下标>
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i]; // 当前的数
            int want = target - x; // 我们想要找的另一半

            // 1. 看看 Map 里有没有我们要找的另一半？
            if (map.containsKey(want)) {
                // 找到了！返回 [另一半的下标, 当前下标]
                return new int[]{map.get(want), i};
            }

            // 2. 没找到，就把自己存进去，等着后面的人来找我
            map.put(x, i);
        }
        return null; // 没找到
    }

    public static void main(String[] args) {
        No01_TwoSum solution = new No01_TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        solution.twoSumBruteForce(nums, target);
        solution.twoSumHashMap(nums, target);
    }
}

