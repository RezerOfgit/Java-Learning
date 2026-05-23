/**
 * LeetCode 27. 移除元素
 * 给你一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，
 * 并返回移除后数组的新长度。
 * 不要使用额外的数组空间，必须仅使用 O(1) 额外空间并原地修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class No27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        // slow 指针指向下一个应该放置不等于 val 的元素的位置
        int slow = 0;

        // fast 指针遍历数组
        for (int fast = 0; fast < nums.length; fast++) {
            // 如果 fast 指向的元素不等于 val，则将其复制到 slow 位置，slow 后移
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            // 如果等于 val，fast 直接跳过，相当于移除了该元素
        }

        // slow 的值就是新数组的长度
        return slow;
    }
}