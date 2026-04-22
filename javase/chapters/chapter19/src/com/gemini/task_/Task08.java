package com.gemini.task_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 * Task: 缓冲字符输入流体验 (BufferedReader)
 * 告别繁琐的数组，体验按行读取的快感！
 */
public class Task08 {
    public static void main(String[] args) {
        // 1. 依然是读取我们昨晚的那封信
        String filePath = "goodnight_note.txt";

        BufferedReader br = null;

        try {
            // 2. 先创建基础节点流（水管）
            FileReader fr = new FileReader(filePath);

            // 3. 将水管套上“高级增压泵”（创建缓冲处理流）
            br = new BufferedReader(fr);

            System.out.println("=== 🚀 开启高级读取模式 (按行读取) ===\n");

            String line;
            // 4. 核心魔法：readLine()！
            // 它会自动读取一整行文字（不包含换行符）。如果读到了文件末尾，会返回 null
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("\n=== 🚀 读取完毕，是不是比 char[] 数组爽多了？ ===");

        } catch (IOException e) {
            System.out.println("找不到文件啦！");
            e.printStackTrace();
        } finally {
            // 5. 关流终极奥义：只需要关闭最外层的包装流！
            // br.close() 内部源码会自动去调用 fr.close()，不用你操心。
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}