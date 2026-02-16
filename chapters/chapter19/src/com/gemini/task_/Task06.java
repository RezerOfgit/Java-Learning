package com.gemini.task_;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 * Task: 字符流体验 (FileWriter)
 * 专门用来写纯文本文件，比字节流更优雅！
 */
public class Task06 {
    public static void main(String[] args) {
        // 1. 准备晚安信的路径
        String filePath = "goodnight_note.txt";

        FileWriter fw = null;

        try {
            // 2. 创建字符输出流对象 (true 代表追加模式)
            fw = new FileWriter(filePath, true);

            // 3. 核心区别：直接写字符串！不需要 getBytes() 了！
            System.out.println("=== 正在书写晚安信 ===");
            fw.write("🌟 恢复训练大成功！\n");

            // 还可以用 write(char[]) 或者写入单个字符
            fw.write("现在的东京时间已经是凌晨快 1 点了。\n");
            fw.write("今天的 5 个 I/O 碎片任务全部通关，休眠舱，启动！\n");

            System.out.println("=== 书写完毕，但如果不关流，字就不会存进硬盘！ ===");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 致命操作：必须关流！
            // 对于 FileWriter 来说，只有执行了 close() 或 flush()，数据才会真正刷入磁盘！
            try {
                if (fw != null) {
                    fw.close();
                    System.out.println("流已关闭，数据安全着陆硬盘。");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}