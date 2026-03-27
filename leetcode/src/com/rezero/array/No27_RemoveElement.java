package com.rezero.array;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素。
 * 元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
 * 假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：
 * 更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。
 * nums 的其余元素和 nums 的大小并不重要。返回 k。
 */
public class No27_RemoveElement {

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        No27_RemoveElement solution = new No27_RemoveElement();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int val = 4;
        System.out.println(solution.removeElement(nums, val));
    }
}