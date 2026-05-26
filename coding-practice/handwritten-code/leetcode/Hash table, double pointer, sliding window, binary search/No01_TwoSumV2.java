/**
 * LeetCode 1. 两数之和（二刷）
 * 在整数数组中找出和为 target 的两个数的下标，每个输入只有一个答案，同一元素不能重复使用。
 * 本题要求达到面试手写零失误的程度。
 */
public class No01_TwoSumV2 {
    public int[] twoSum(int[] nums, int target) {
        // 哈希表存 值 -> 下标，遍历时边存边查
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // 如果互补值已经在 map 里，直接返回结果
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            // 没有找到，把当前元素存入 map 供后面匹配
            map.put(nums[i], i);
        }

        // 题目保证有解，这里仅为了编译
        return new int[0];
    }
}