/**
 * LeetCode 55. 跳跃游戏
 * 给定一个非负整数数组 nums，你最初位于数组的第一个下标。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个下标。
 */
public class No55_JumpGame {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int maxReach = 0; // 当前能够到达的最远位置

        for (int i = 0; i < nums.length; i++) {
            // 如果当前位置已经超过了最远可达距离，说明无法到达 i，直接返回 false
            if (i > maxReach) {
                return false;
            }
            // 更新最远可达距离：当前位置 + 跳跃长度
            maxReach = Math.max(maxReach, i + nums[i]);
            // 提前结束：如果最远可达距离已经覆盖最后一个下标，返回 true
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        // 循环结束也没达到最后一个下标（例如数组只有一个元素已在循环内处理）
        return maxReach >= nums.length - 1;
    }
}