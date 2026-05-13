package com.gemini.day03;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 * 有 N 个人围成一圈，编号 1 到 N。从第 1 号开始报数，报到 M 的人出列。
 * 下一个人继续从 1 开始报数。求最后一个留在场上的人的编号。
 * 输入： N = 5, M = 2 (5个人，数到2出列)
 * 输出： 3
 * (过程：1, 2(出列), 3, 4(出列), 5, 1(出列), 3, 5(出列), 最后剩 3)
 */
public class No02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNext()) return;

        // 假设输入：N个人，数到M淘汰
        int n = in.nextInt();
        int m = in.nextInt();

        // 边界防御（机考一定要养成习惯）
        if (n <= 1 || m <= 0) {
            System.out.println(n == 1 ? 1 : 0);
            return;
        }

        Deque<Integer> queue = new LinkedList<>();
        // 1. 初始化：所有人排好队
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int count = 1; // 报数器

        // 2. 开始转圈，直到场上只剩最后一个人
        while (queue.size() > 1) {
            int curr = queue.poll(); // 队头的人出列

            if (count == m) {
                // 报到 M，这个人被淘汰，不需要放回队列了
                count = 1; // ⚠️ 注意：报数器归零重置（下一轮从1开始）
            } else {
                // 没报到 M，死里逃生，去队尾重新排队
                queue.offer(curr);
                count++; // 报数器继续累加
            }
        }

        // 3. 输出场上仅剩的那位真神
        System.out.println(queue.peek());
    }
}
