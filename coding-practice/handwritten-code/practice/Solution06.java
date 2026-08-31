class Solution {
    public String convert(String s, int numRows) {
        // 边界情况：只有一行或字符串为空，直接返回原字符串
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // 初始化每行的 StringBuilder
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean goingDown = false;

        // 遍历每个字符，分配到对应的行
        for (char c : s.toCharArray()) {
            rows.get(currentRow).append(c);
            // 到达顶部或底部时改变方向
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        // 拼接所有行
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }
}