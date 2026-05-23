/**
 * LeetCode 1. 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，
 * 请在该数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 假设每种输入只会对应一个答案，且同一个元素不能使用两遍。
 */
public class No01_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // key: 元素值, value: 元素下标
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // 如果差值已经存在于 map 中，说明之前遍历过的某个元素与当前元素配对成功
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            // 否则将当前元素及其下标存入 map，供后续配对
            map.put(nums[i], i);
        }

        // 根据题目假设，这里不会执行到，但为了编译通过需要返回一个空数组
        return new int[0];
    }
}