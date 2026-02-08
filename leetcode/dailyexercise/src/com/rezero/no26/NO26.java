package com.rezero.no26;

/**
 * @author Re-zero
 * @version 1.0
 */
public class NO26 {
    /*
    给你一个非严格递增排列的数组nums，请你原地删除重复出现的元素，
    使每个元素只出现一次，返回删除后数组的新长度。元素的相对顺序应该保持一致。
    然后返回nums中唯一元素的个数。

    考虑nums的唯一元素的数量为k。去重后，返回唯一元素的数量k。
    nums的前k个元素应包含排序后的唯一数字。下标k - 1之后的剩余元素可以忽略。
     */

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(nums));
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        // 边界情况：如果数组是空的，直接返回 0
        if (nums.length == 0) return 0;

        // 定义慢指针 i，初始在 0
        int i = 0;

        // 定义快指针 j，从 1 开始遍历整个数组
        for (int j = 1; j < nums.length; j++) {

            // 思考：什么时候我们才需要移动慢指针并赋值？
            // 当 快指针(j) 指向的数字 和 慢指针(i) 指向的数字不同时...
            if (nums[j] != nums[i]) {
                // 1. 让慢指针 i 往前走一步 (i++)
                i++;
                // 2. 把快指针发现的新数字(nums[j]) 赋值给 nums[i]
                nums[i] = nums[j];
                // 请在这里写出这两行代码：

            }
        }

        // 题目要求返回新数组的长度。
        // 因为索引是从 0 开始的，所以长度是 索引 + 1
        return i + 1;
    }
}
