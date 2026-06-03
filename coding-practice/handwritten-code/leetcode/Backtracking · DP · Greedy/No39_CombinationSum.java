/**
 * LeetCode 39. 组合总和
 * 给你一个无重复元素的整数数组 candidates 和一个目标整数 target，
 * 找出 candidates 中可以使数字和为目标数 target 的所有不同组合，
 * 并以列表形式返回。可以按任意顺序返回这些组合。
 * candidates 中的同一个数字可以无限制重复被选取。
 * 如果至少一个数字的被选数量不同，则两种组合是不同的。
 */
public class No39_CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(candidates, target, 0, 0, path, result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, int currentSum,
                           List<Integer> path, List<List<Integer>> result) {
        // 剪枝：和超过 target，没必要继续
        if (currentSum > target) {
            return;
        }
        // 找到一个组合
        if (currentSum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // 做选择
            path.add(candidates[i]);
            // 递归：因为可以重复使用同一元素，start 仍然是 i（不是 i+1）
            backtrack(candidates, target, i, currentSum + candidates[i], path, result);
            // 撤销选择
            path.remove(path.size() - 1);
        }
    }
}