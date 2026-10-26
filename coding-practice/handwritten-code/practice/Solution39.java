class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        // 排序便于剪枝（若当前和已超过 target，后面的更大数必然也超）
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> path,
                           int[] candidates, int remain, int start) {
        if (remain == 0) {
            result.add(new ArrayList<>(path)); // 找到一组解，拷贝后加入结果
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // 剪枝：当前数字已超过剩余目标，后面的更大，直接结束
            if (candidates[i] > remain) break;

            path.add(candidates[i]);                             // 做选择
            // 注意传 i 而不是 i+1，允许同一个数字重复使用
            backtrack(result, path, candidates, remain - candidates[i], i);
            path.remove(path.size() - 1);                        // 撤销选择
        }
    }
}