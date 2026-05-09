package com.gemini.day01;

import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 */
public class No04 {
    public static void main(String[] args) {
        // 1. 标准 I/O 接收参数
        Scanner in = new Scanner(System.in);
        // 如果没有输入直接结束（防坑）
        if (!in.hasNext()) return;

        int k = in.nextInt();
        String s = in.next();

        // 2. 按照 "-" 分割字符串
        String[] parts = s.split("-");

        // 3. 核心：第一部分不需要处理，直接作为结果的开头
        // 频繁拼接字符串，必须用 StringBuilder！
        StringBuilder result = new StringBuilder(parts[0]);

        // 4. 把后面的部分全部拼起来，去掉原有的 "-"
        StringBuilder restString = new StringBuilder();
        for (int i = 1; i < parts.length; i++) {
            restString.append(parts[i]);
        }

        // 将后面拼接好的纯净字符串拿出来准备切片
        String rest = restString.toString();

        // 5. 每 K 个字符切分一次，并处理大小写
        // i 每次跳跃 k 的长度
        for (int i = 0; i < rest.length(); i += k) {
            // 截取长度为 k 的子串（注意：最后一段可能不足 k 个，容易数组越界，用 Math.min 防护）
            int end = Math.min(i + k, rest.length());
            String sub = rest.substring(i, end);

            // 统计大小写字母数量
            int upperCount = 0;
            int lowerCount = 0;
            for (char c : sub.toCharArray()) {
                if (Character.isUpperCase(c)) upperCount++;
                else if (Character.isLowerCase(c)) lowerCount++;
            }

            // 根据规则转换大小写
            if (lowerCount > upperCount) {
                sub = sub.toLowerCase();
            } else if (upperCount > lowerCount) {
                sub = sub.toUpperCase();
            }
            // 如果相等则什么都不做

            // 拼接到最终结果中，注意要加上 "-"
            result.append("-").append(sub);
        }

        // 6. 打印输出
        System.out.println(result.toString());
    }
}