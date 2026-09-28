class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);   // 找左边界
        int last = findBound(nums, target, false);   // 找右边界
        return new int[]{first, last};
    }

    /**
     * @param leftBound true 表示找第一个位置，false 表示找最后一个位置
     */
    private int findBound(int[] nums, int target, boolean leftBound) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;
                if (leftBound) {
                    right = mid - 1; // 继续向左找更早出现的位置
                } else {
                    left = mid + 1;  // 继续向右找更晚出现的位置
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}