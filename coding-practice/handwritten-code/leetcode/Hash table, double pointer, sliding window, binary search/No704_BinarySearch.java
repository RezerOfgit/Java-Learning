/**
 * LeetCode 704. 二分查找
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 */
public class No704_BinarySearch {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        // 经典二分模板：左闭右闭区间
        while (left <= right) {
            // 避免溢出，等价于 (left + right) / 2
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}