package com.rezero;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地 对它们进行排序，
 * 使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 必须在不使用库内置的 sort 函数的情况下解决这个问题。
 */
public class No75_SortColors {
    public void sortColors(int[] nums) {
        int p0 = 0;
        int p2 = nums.length - 1;
        int curr = 0;

        while (curr <= p2) {
            int temp = nums[curr];
            if (nums[curr] == 0) {
                temp = nums[curr];
                nums[curr] = nums[p0];
                nums[p0] = temp;
                p0++;
                curr++;
            } else if (nums[curr] == 2) {
                nums[curr] = nums[p2];
                nums[p2] = temp;
                p2--;
            } else {
                curr++;
            }
        }
    }


    public void sortColors_my(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
