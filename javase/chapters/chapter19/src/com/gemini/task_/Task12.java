package com.gemini.task_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Re-zero
 * @version 1.0
 * Task: 打印流体验 (PrintWriter)
 * I/O 流里的傻瓜相机，最简单的文本写入方式！
 */
public class Task12 {
    public static void main(String[] args) {
        String filePath = "easy_print.txt";
        PrintWriter pw = null;

        try {
            // 只需要把它套在一个普通的 FileWriter 外面
            pw = new PrintWriter(new FileWriter(filePath));

            System.out.println("=== 🖨️ 极简打印机启动 ===");

            // 核心魔法：直接像平时写代码一样用 print 和 println！
            pw.println("🌟 轻松模式开启！");
            pw.println("🌟 这是 PrintWriter 打印出来的话。");
            pw.println("🌟 它不需要 getBytes()，也不需要手动 newLine()。");
            pw.print("🌟 它连不换行的 print() 都支持！太省心了！");

            System.out.println("=== ✅ 打印完成！毫无压力！ ===");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关流依然是好习惯
            if (pw != null) {
                pw.close();
            }
        }
    }
}