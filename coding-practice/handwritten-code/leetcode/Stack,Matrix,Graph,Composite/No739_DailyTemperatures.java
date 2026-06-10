/**
 * LeetCode 739. 每日温度
 * 给定一个整数数组 temperatures，表示每天的温度，
 * 返回一个数组 answer，其中 answer[i] 是指对于第 i 天，
 * 下一个更高温度出现在几天后。如果气温在这之后都不会升高，请在该位置用 0 来代替。
 */
public class No739_DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        // 单调栈（递减栈），存储索引
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int currentTemp = temperatures[i];
            // 当前温度比栈顶索引对应的温度高时，可以更新栈顶元素的答案
            while (!stack.isEmpty() && currentTemp > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex; // 相差天数
            }
            stack.push(i);
        }

        // 栈中剩余元素后面没有更高的温度，默认 answer 中的值就是 0
        return answer;
    }
}