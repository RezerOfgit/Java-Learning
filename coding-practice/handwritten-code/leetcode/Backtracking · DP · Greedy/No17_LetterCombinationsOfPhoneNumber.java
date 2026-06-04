/**
 * LeetCode 17. 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按任意顺序返回。
 * 数字到字母的映射与电话按键相同（九宫格键盘）。
 */
public class No17_LetterCombinationsOfPhoneNumber {
    // 数字到字母的映射表
    private static final String[] MAPPING = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result; // 空输入返回空列表
        }

        StringBuilder path = new StringBuilder();
        backtrack(digits, 0, path, result);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder path, List<String> result) {
        // 终止条件：已经处理完所有数字，产生一个完整组合
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        // 获取当前数字对应的字母集合
        char digit = digits.charAt(index);
        String letters = MAPPING[digit - '0'];

        // 遍历每个字母，递归到下一层
        for (char c : letters.toCharArray()) {
            path.append(c);                              // 做选择
            backtrack(digits, index + 1, path, result);  // 处理下一个数字
            path.deleteCharAt(path.length() - 1);        // 撤销选择
        }
    }
}