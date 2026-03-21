package com.rezero.array;

import java.util.Arrays;

/**
 * @author Re-zero
 * @version 1.0
 * 题目：88. 合并两个有序数组
 * 难度：简单
 * 描述：给你两个按非递减顺序排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示它们的元素数目。
 * 请你合并 nums2 到 nums1 中，使合并后的数组同样按非递减顺序排列。
 * 注意：最终合并后数组不应由函数返回，而是存储在数组 nums1 中。
 */
public class No88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 1. 定义三个指针
        int p1 = m - 1;           // nums1 有效元素的最后一位
        int p2 = n - 1;           // nums2 的最后一位
        int tail = m + n - 1;     // nums1 整个数组的最后一位（当前要填的坑）
        // 2. 当两个数组都还有元素可以比较时
        while (p1 >= 0 && p2 >= 0) {
            // 谁比较大，就把谁填进 tail 坑位里，然后对应的指针和 tail 往前移 (减1)
            if (nums1[p1] > nums2[p2]) {
                nums1[tail] = nums1[p1];
                p1--;
            } else {
                nums1[tail] = nums2[p2];
                p2--;
            }
            tail--;
        }
        // 3. 扫尾工作
        // 想象一下：如果 nums1 的数字全比 nums2 大，nums1 早就搬完了，
        // 此时 nums2 还剩下一堆小数字。我们只需把 nums2 剩下的直接复制过去即可。
        // （如果剩下的是 nums1，根本不用管，因为它们本来就在正确的位置上！）
        while (p2 >= 0) {
            nums1[tail] = nums2[p2];
            p2--;
            tail--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        No88_MergeSortedArray solution = new No88_MergeSortedArray();
        solution.merge(nums1, m, nums2, n);
        System.out.println("测试结果: " + Arrays.toString(nums1));
    }
}
