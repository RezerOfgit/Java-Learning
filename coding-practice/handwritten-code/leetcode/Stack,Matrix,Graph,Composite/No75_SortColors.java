/**
 * LeetCode 75. 颜色分类 (荷兰国旗问题)
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums，
 * 原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 我们使用整数 0、1 和 2 分别表示红色、白色和蓝色。
 * 必须在不使用库内置的 sort 函数的情况下解决这个问题。
 */
public class No75_SortColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int p0 = 0;          // 指向 0 应该放置的位置（左边界）
        int p2 = nums.length - 1; // 指向 2 应该放置的位置（右边界）
        int curr = 0;        // 当前遍历指针

        while (curr <= p2) {
            if (nums[curr] == 0) {
                // 与 p0 交换，然后两者都前进
                swap(nums, curr, p0);
                p0++;
                curr++;
            } else if (nums[curr] == 2) {
                // 与 p2 交换，交换后 curr 不动（因为换来的元素还没检查过）
                swap(nums, curr, p2);
                p2--;
            } else {
                // nums[curr] == 1，已经在正确位置，继续前进
                curr++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}