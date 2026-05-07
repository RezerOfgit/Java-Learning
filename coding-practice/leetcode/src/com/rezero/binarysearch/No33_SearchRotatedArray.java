package com.rezero.binarysearch;

/**
 * @author Re-zero
 * @version 1.0
 * 整数数组 nums 按升序排列，数组中的值 互不相同 。
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 向左旋转，
 * 使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ...,
 * nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 下标 3 上向左旋转后可能变为
 * [4,5,6,7,0,1,2] 。
 * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，
 * 则返回它的下标，否则返回 -1 。
 */
public class No33_SearchRotatedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // 步骤 1：判断哪一半是有序的
            if (nums[left] <= nums[mid]) {
                // 左半部分是完美升序的
                if (target >= nums[left] && target < nums[mid]) {
                    // 目标在左半边，收缩右边界
                    right = mid - 1;
                } else {
                    // 目标不在左半边，只能去右边找
                    left = mid + 1;
                }
            } else {
                // 步骤 2：右半部分是完美升序的
                if (target > nums[mid] && target <= nums[right]) {
                    // 目标在右半边，收缩左边界
                    left = mid + 1;
                } else {
                    // 目标不在右半边，只能去左边找
                    right = mid - 1;
                }
            }
        }
        return -1;
    }


    public int search_my(int[] nums, int target) {

        int left = 0;
        while (nums[left] != target) {
            left++;
            if (left == nums.length) {
                return -1;
            }
        }
        return left;
    }
}
