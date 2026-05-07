package com.rezero.binarysearch;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
 * 写一个函数搜索 nums 中的 target，如果 target 存在返回下标，否则返回 -1。
 * 你必须编写一个具有 O(log n) 时间复杂度的算法。
 */
public class No704_BinarySearch {
    public int search(int[] nums, int target) {
        // 1. 定义左右边界（闭区间 [left, right]，也就是两头都包含）
        int left = 0;
        int right = nums.length - 1;

        // 2. 当左边界还没越过右边界时，继续找
        // 记住核心：因为是闭区间，left == right 是有意义的（比如包围圈只剩最后1个数字时，还得检查一下）
        while (left <= right) {

            // 3. 计算中间位置 mid
            // 为什么不用 (left + right) / 2 ? 因为当数组极大时，left + right 可能会导致 int 溢出（变成负数）
            // 这是一个极其加分的面试细节！
            int mid = left + (right - left) / 2;

            // 4. 判断逻辑
            if (nums[mid] == target) {
                // 如果刚好中间这个就是，直接返回下标！
                return mid;
            } else if (nums[mid] < target) {
                // 如果中间值小于目标值，说明 target 在右半边。
                // 既然 mid 已经检查过不是 target 了，左边界直接移动到 mid 的下一位！
                left = mid + 1;

            } else {
                // 如果中间值大于目标值，说明 target 在左半边。
                // 右边界移动到 mid 的前一位！
                right = mid - 1;
            }
        }

        // 5. 如果把所有可能的区间都找完了，while 循环结束了还没 return，说明字典里根本没有这个词。
        return -1;
    }

    public static void main(String[] args) {
        No704_BinarySearch solution = new No704_BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(solution.search(nums, target));
    }
}
