/**
 * LeetCode 34. 在排序数组中查找元素的第一个和最后一个位置
 * 给定一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。
 * 请你找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * 你必须设计并实现时间复杂度为 O(log n) 的算法。
 */
public class No34_FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        int first = findBound(nums, target, true);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        int last = findBound(nums, target, false);
        return new int[]{first, last};
    }

    // 找边界：isFirst = true 找第一个，false 找最后一个
    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                if (isFirst) {
                    // 找第一个位置：如果已经是数组最左端，或者前一个元素不等于 target，则找到
                    if (mid == 0 || nums[mid - 1] != target) {
                        return mid;
                    }
                    right = mid - 1; // 继续向左找
                } else {
                    // 找最后一个位置：如果已经是数组最右端，或者后一个元素不等于 target，则找到
                    if (mid == nums.length - 1 || nums[mid + 1] != target) {
                        return mid;
                    }
                    left = mid + 1; // 继续向右找
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}