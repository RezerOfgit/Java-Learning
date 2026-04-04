package com.rezero.binarysearch;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。
 * 请你找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 */
public class No34_FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length == 0) return result;

        // 分别找左右边界
        result[0] = findBound(nums, target, true);  // true 代表找左边界
        result[1] = findBound(nums, target, false); // false 代表找右边界
        return result;
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1, bound = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                bound = mid; // 先记录下来
                if (isFirst) right = mid - 1; // 找左边界，所以继续往左逼近
                else left = mid + 1;          // 找右边界，所以继续往右逼近
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return bound;
    }


    public int[] searchRange_my(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < nums.length && nums[left] != target) {
            left++;
        }
        if (left == nums.length) {
            return new int[]{-1, -1};
        }

        while (right >= 0 && nums[right] != target) {
            right--;
        }

        return new int[]{left, right};
    }
}
