class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        // 初始化为前三数之和，避免使用最大整数导致溢出
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            // 跳过重复的 i，减少冗余计算
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // 若当前和更接近 target，更新结果
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum == target) {
                    return target; // 已经找到最接近的值，直接返回
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closest;
    }
}