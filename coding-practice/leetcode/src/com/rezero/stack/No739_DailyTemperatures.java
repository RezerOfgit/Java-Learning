package com.rezero.stack;

import java.util.Stack;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，
 * 其中 answer[i] 是指对于第 i 天，下一个更高温度出现在几天后。如果气温在这之后都不会升高，
 * 请在该位置用 0 来代替。
 */
public class No739_DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] result = new int[length];

        // 栈里存的是数组的下标 (索引)
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            // 当前天的温度
            int currentTemp = temperatures[i];

            // 核心实现步骤：
            // 当栈不为空，并且【当前天的温度】大于【栈顶索引对应的温度】时
            // 说明栈顶的那一天终于等到了升温！
            while (!stack.isEmpty() && currentTemp > temperatures[stack.peek()]) {
                // 1. 弹出栈顶索引 (代表那是哪一天)
                Integer prevIndex = stack.pop();

                // 2. 计算等了几天：当前索引 i 减去 弹出的索引 prevIndex
                // 3. 把算出来的天数填入 result[prevIndex] 的位置中
                result[prevIndex] = i - prevIndex;

            }

            // 处理完后，把今天的索引压入栈，继续等待未来的高温
            stack.push(i);
        }

        return result;
    }
}
