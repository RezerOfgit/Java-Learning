/**
 * LeetCode 46. 全排列
 * 给定一个不含重复数字的数组 nums，返回其所有可能的全排列。可以按任意顺序返回答案。
 */
public class No46_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        boolean[] used = new boolean[nums.length]; // 标记元素是否已在当前排列中使用
        List<Integer> path = new ArrayList<>();    // 当前排列路径
        backtrack(nums, used, path, result);
        return result;
    }

    private void backtrack(int[] nums, boolean[] used, List<Integer> path, List<List<Integer>> result) {
        // 终止条件：路径长度等于数组长度，找到一个全排列
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path)); // 必须 new 拷贝，不能直接加 path
            return;
        }

        // 遍历选择列表
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue; // 跳过已使用的元素
            }
            // 做选择
            path.add(nums[i]);
            used[i] = true;
            // 递归
            backtrack(nums, used, path, result);
            // 撤销选择（回溯）
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}