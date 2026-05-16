package com.gemini.day06;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个字符串，代表用户输入的密码。其中退格键用符号 < 表示（即删除前一个输入的字符）。
 * 请输出最终实际输入的密码字符串。如果最终密码为空，则输出 empty。
 * 输入格式：
 * 一行字符串，例如：
 * ABC<D<<E
 * 输出格式：
 * 实际输入的字符串，例如：
 * AE
 * 补充解释：
 * 输入 C 后遇到 <，退格删掉 C；接着输入 D 后遇到两个 <<，连续两次退格删掉 D 和 B；
 * 最后剩下的有效字符是 A 和 E。
 */
public class No02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextLine()) return;
        String s = in.nextLine();

        // 使用双端队列模拟栈
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '<') {
                // 遇到退格键，且栈不为空时，弹出栈顶元素（删除前一个字符）
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // 正常字符，压入栈中
                stack.push(c);
            }
        }

        // 栈为空的边界处理
        if (stack.isEmpty()) {
            System.out.println("empty");
            return;
        }

        // 注意：栈是先进后出，为了恢复正常的字符串顺序，必须从栈底拿取元素拼接
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pollLast());
        }

        System.out.println(sb.toString());
    }
}