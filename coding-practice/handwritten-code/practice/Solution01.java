class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 使用 HashMap 存储数值到索引的映射
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // 如果补数已存在，直接返回结果
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            // 否则将当前值和索引存入 map
            map.put(nums[i], i);
        }
        // 题目保证有解，不会执行到这里
        return new int[]{-1, -1};
    }
}