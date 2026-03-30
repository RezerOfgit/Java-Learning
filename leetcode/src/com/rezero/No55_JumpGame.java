package com.rezero;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个非负整数数组 nums ，你最初位于数组的 第一个下标 。数组中的每个元素代表你在该位置
 * 可以跳跃的最大长度。
 * 判断你是否能够到达最后一个下标，如果可以，返回 true ；否则，返回 false 。
 */
public class No55_JumpGame {
    public boolean canJump(int[] nums) {
        // 记录当前能跳到的最远下标，初始在 0 位置
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            // 1. 致命危机：如果当前位置 i 已经超过了你能跳到的最远距离 maxReach
            // 说明你卡在半路了，根本走不到 i 这里！
            if (i > maxReach) {
                return false;
            }

            // 2. 刷新纪录：比较当前的 maxReach 和 从当前位置 i 起跳能达到的最远距离
            maxReach = Math.max(maxReach, i + nums[i]);

            // 3. 提前胜利：如果最远距离已经能盖过终点了，直接返回 true
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }
}
