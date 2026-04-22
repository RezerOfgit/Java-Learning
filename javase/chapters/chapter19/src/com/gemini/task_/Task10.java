package com.gemini.task_;

import java.io.*;

/**
 * @author Re-zero
 * @version 1.0
 * Task: 缓冲字符流拷贝 (Buffered Copy)
 * 纯文本文件拷贝的最高效姿势！
 */
public class Task10 {
    public static void main(String[] args) {
        // 1. 指定源文件和目标文件
        String srcPath = "buffered_note.txt";      // 刚才写的源文件
        String destPath = "buffered_note_copy.txt"; // 要拷贝出的新文件

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // 2. 一次性搭建好“高级抽水泵”和“高级注水泵”
            br = new BufferedReader(new FileReader(srcPath));
            bw = new BufferedWriter(new FileWriter(destPath));

            System.out.println("=== 🖨️ 启动高级文本复印机 ===");

            String line;
            // 3. 核心大循环：读一行，写一行！
            while ((line = br.readLine()) != null) {
                bw.write(line); // 把读到的这一行写进去
                bw.newLine();   // ⚠️ 致命细节：一定要补上换行符！否则全挤在一起！
            }

            System.out.println("=== ✅ 拷贝完成！速度起飞！ ===");

        } catch (IOException e) {
            System.out.println("拷贝出错了，是不是源文件名字写错啦？");
            e.printStackTrace();
        } finally {
            // 4. 关流：先关写的，再关读的
            try {
                if (bw != null) bw.close();
                if (br != null) br.close();
                System.out.println("水电阀门已全部安全关闭。");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}