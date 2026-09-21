class Solution {
    public int removeElement(int[] nums, int val) {
        // slow 指向下一个要写入的位置
        int slow = 0;

        // fast 遍历整个数组
        for (int fast = 0; fast < nums.length; fast++) {
            // 只保留不等于 val 的元素
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        // slow 即为新数组长度
        return slow;
    }
}