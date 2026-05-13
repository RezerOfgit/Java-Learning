package com.gemini.day03;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个只包含小写字母的字符串 s。如果发现有两个相邻且相同的字母，就消除它们。
 * 消除后，剩下的字母会自动拼在一起，如果拼在一起后又产生了相邻且相同的字母，继续消除。
 * 直到无法消除为止。返回最终的字符串。
 * 输入： abbaca
 * 输出： ca
 * (推理过程：abbaca -> 消除 bb -> aaca -> 消除 aa -> ca)
 */
public class No01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNext()) return;
        String s = in.nextLine();

        // 官方推荐：用 ArrayDeque 代替老旧的 Stack 类
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            // 如果栈不为空，且当前字符和栈顶字符一样，发生“消除”
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                // 否则，正常入栈
                stack.push(c);
            }
        }

        // 如果全消光了，按题目要求输出0（部分机考题要求输出空串，以题意为准）
        if (stack.isEmpty()) {
            System.out.println("0");
            return;
        }

        // ⚠️ 关键防坑：栈是后进先出。为了恢复原来的字符串顺序，我们需要从栈底往上拿！
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            // pollLast() 是双端队列的神技，直接从底部抽离元素
            result.append(stack.pollLast());
        }

        System.out.println(result.toString());
    }
}
