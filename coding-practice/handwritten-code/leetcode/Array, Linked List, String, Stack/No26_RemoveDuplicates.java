/**
 * LeetCode 26. 删除有序数组中的重复项
 * 给定一个升序排列的数组 nums，原地删除重复出现的元素，
 * 使每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // slow 指针指向已处理不重复区域的最后一个元素
        int slow = 0;

        // fast 指针用于遍历数组，寻找与 slow 不同的元素
        for (int fast = 1; fast < nums.length; fast++) {
            // 当 fast 指向的元素与 slow 不同时，说明遇到新元素
            if (nums[fast] != nums[slow]) {
                slow++;                    // slow 先向后移动一位
                nums[slow] = nums[fast];   // 将新元素放入 slow 位置
            }
            // 如果相同，fast 继续前进，不做任何操作
        }

        // 新数组长度为 slow + 1
        return slow + 1;
    }
}