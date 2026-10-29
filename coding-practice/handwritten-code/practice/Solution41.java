class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // 1. 原地哈希：把数值 x 放到下标 x-1 的位置上
        for (int i = 0; i < n; i++) {
            // 只处理范围在 [1, n] 内的数，避免越界
            // 用 while 而非 if，因为交换过来的新值可能还需继续归位
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        // 2. 再次遍历，第一个位置不对的数即为缺失的最小正数
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // 3. 若 [1, n] 全部就位，则缺失的是 n+1
        return n + 1;
    }
}