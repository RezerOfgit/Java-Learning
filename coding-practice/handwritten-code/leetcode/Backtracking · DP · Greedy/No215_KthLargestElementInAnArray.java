/**
 * LeetCode 215. 数组中的第K个最大元素
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 * 你需要找的是数组排序后的第 k 个最大元素，而不是第 k 个不同的元素。
 */
public class No215_KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        // 建立一个容量为 k 的最小堆，堆顶就是第 k 大的元素
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            // 堆的容量超过 k 时，弹出最小的元素，保持堆中始终有 k 个最大的元素
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // 此时堆顶就是第 k 大的元素
        return minHeap.peek();
    }
}