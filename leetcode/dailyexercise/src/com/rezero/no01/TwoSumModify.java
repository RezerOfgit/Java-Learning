package com.rezero.no01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Re-zero
 * @version 1.0
 */
public class TwoSumModify {
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map<数值, 下标>
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i]; // 当前的数
            int want = target - x; // 我们想要找的另一半

            // 1. 看看 Map 里有没有我们要找的另一半？
            if (map.containsKey(want)) {
                // 找到了！返回 [另一半的下标, 当前下标]
                return new int[] { map.get(want), i };
            }

            // 2. 没找到，就把自己存进去，等着后面的人来找我
            map.put(x, i);
        }
        return null; // 没找到
    }
}
