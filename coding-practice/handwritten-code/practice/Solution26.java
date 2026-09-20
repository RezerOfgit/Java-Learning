class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // slow 指向已处理好的不重复序列的最后一个位置
        int slow = 0;

        // fast 负责遍历整个数组
        for (int fast = 1; fast < nums.length; fast++) {
            // 发现新元素，写入 slow 的下一个位置
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }

        // 新数组长度为 slow + 1
        return slow + 1;
    }
}