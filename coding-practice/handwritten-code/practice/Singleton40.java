class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        // 排序：便于剪枝，同时让相同数字相邻，方便去重
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> path,
                           int[] candidates, int remain, int start) {
        if (remain == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // 剪枝：当前数字已超过剩余目标，后面的更大，直接结束
            if (candidates[i] > remain) break;

            // 去重：同一层中，若当前数字与前一个数字相同，跳过（避免重复组合）
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            path.add(candidates[i]);                                  // 做选择
            // 传 i+1，每个数字只能使用一次
            backtrack(result, path, candidates, remain - candidates[i], i + 1);
            path.remove(path.size() - 1);                             // 撤销选择
        }
    }
}