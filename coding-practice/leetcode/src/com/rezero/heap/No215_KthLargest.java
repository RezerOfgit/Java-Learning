package com.rezero.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Re-zero
 * @version 1.0
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * 你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。
 */
public class No215_KthLargest {
    public int findKthLargest(int[] nums, int k) {
        // Java 中的 PriorityQueue 默认就是最小堆
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            // 1. 把当前数字放入堆
            minHeap.add(num);

            // 2. 如果堆的大小超过了 k，把最小的（堆顶）弹出
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // 3. 最后堆顶剩下的就是第 k 大的元素
        return minHeap.peek();
    }

    public int findKthLargest_my(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
