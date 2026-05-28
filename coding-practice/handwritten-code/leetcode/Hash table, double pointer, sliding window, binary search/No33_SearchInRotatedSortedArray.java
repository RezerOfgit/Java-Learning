/**
 * LeetCode 33. 搜索旋转排序数组
 * 整数数组 nums 按升序排列，数组中的值互不相同。
 * 在传递给函数之前，nums 在预先未知的某个下标 k 上进行了旋转，
 * 使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]。
 * 例如，[0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2]。
 * 给你旋转后的数组 nums 和一个整数 target，如果 nums 中存在这个目标值 target，
 * 则返回它的下标，否则返回 -1。
 * 你必须设计一个时间复杂度为 O(log n) 的算法解决此问题。
 */
public class No33_SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // 判断 mid 处于左半段还是右半段
            if (nums[left] <= nums[mid]) { // mid 在左半段
                if (target >= nums[left] && target < nums[mid]) {
                    // target 在左半段的有序区间内，搜索左边
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // mid 在右半段
                if (target > nums[mid] && target <= nums[right]) {
                    // target 在右半段的有序区间内，搜索右边
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}