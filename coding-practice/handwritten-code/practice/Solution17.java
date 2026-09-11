class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        // 数字到字母的映射，索引对应数字，0 和 1 无意义
        String[] map = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(result, new StringBuilder(), digits, 0, map);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder sb,
                           String digits, int index, String[] map) {
        // 终止条件：已经处理完所有数字
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        // 获取当前数字对应的所有字母
        String letters = map[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            sb.append(c);                          // 做选择
            backtrack(result, sb, digits, index + 1, map); // 进入下一层
            sb.deleteCharAt(sb.length() - 1);      // 撤销选择
        }
    }
}