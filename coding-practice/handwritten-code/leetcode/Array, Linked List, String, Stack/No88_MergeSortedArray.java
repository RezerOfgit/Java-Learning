/**
 * LeetCode 88. 合并两个有序数组
 * 给你两个按非递减顺序排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n，
 * 分别表示 nums1 和 nums2 中的元素数目。
 * 请你合并 nums2 到 nums1 中，使合并后的数组同样按非递减顺序排列。
 * 注意：最终结果存储在 nums1 中，nums1 的初始长度为 m + n，
 * 前 m 个元素是应合并的元素，后 n 个元素为 0，应忽略。
 */
public class No88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 从后往前填充，避免覆盖 nums1 中尚未处理的元素
        int p1 = m - 1;      // nums1 有效部分的最后一个元素下标
        int p2 = n - 1;      // nums2 的最后一个元素下标
        int tail = m + n - 1; // 合并后数组的最后一个位置

        // 只要两个数组都还有元素未处理，就继续比较
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[tail] = nums1[p1];
                p1--;
            } else {
                nums1[tail] = nums2[p2];
                p2--;
            }
            tail--;
        }

        // 如果 nums2 还有剩余元素（nums1 已用完），需要将其复制到 nums1 前面
        // 如果 nums1 有剩余，则不需要处理，因为它们已经在正确的位置上了
        while (p2 >= 0) {
            nums1[tail] = nums2[p2];
            p2--;
            tail--;
        }
    }
}