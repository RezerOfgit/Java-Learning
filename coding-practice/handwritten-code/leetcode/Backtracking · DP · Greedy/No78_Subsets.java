/**
 * LeetCode 78. 子集
 * 给你一个整数数组 nums，数组中的元素互不相同。返回该数组所有可能的子集（幂集）。
 * 解集不能包含重复的子集。你可以按任意顺序返回解集。
 */
public class No78_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(nums, 0, path, result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
        // 每个节点都是有效子集，直接加入结果（无需等到特定深度）
        result.add(new ArrayList<>(path));

        // 从 start 开始遍历，避免产生重复子集（如 [1,2] 和 [2,1]）
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, i + 1, path, result); // i+1 保证不重复使用同一元素
            path.remove(path.size() - 1);
        }
    }
}