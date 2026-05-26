/**
 * LeetCode 15. 三数之和
 * 给你一个整数数组 nums，判断是否存在三元组 [nums[i], nums[j], nums[k]]
 * 满足 i != j、i != k 且 j != k，同时还满足 nums[i] + nums[j] + nums[k] == 0。
 * 返回所有和为 0 且不重复的三元组。
 */
public class No15_ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }

        // 排序，便于跳过重复元素和使用双指针
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // 已排序，若最小数大于0，三数和必大于0，可直接跳出
            if (nums[i] > 0) {
                break;
            }
            // 跳过 i 的重复元素，避免结果重复
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 跳过 left 和 right 的重复元素
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    // 移动指针继续找下一对
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // 需要更大的值
                } else {
                    right--; // 需要更小的值
                }
            }
        }

        return result;
    }
}