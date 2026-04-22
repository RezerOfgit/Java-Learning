package com.gemini.task_;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 * Task: 使用输出流记录恢复状态
 */
public class Task02 {
    public static void main(String[] args) {
        // 1. 确定文件路径 (建议放在项目根目录下，方便查看)
        // 这里的路径可以是绝对路径，也可以是相对路径
        String filePath = "recovery_diary.txt";

        FileOutputStream fos = null;

        try {
            // 2. 创建输出流对象
            // 参数 true 表示：追加写入 (Append Mode)
            // 如果文件不存在，会自动创建；如果存在，会在后面接着写
            fos = new FileOutputStream(filePath, true);

            // 3. 准备要写的内容 (\n 表示换行)
            String content = "\n[2026-02-12] 身体恢复 90%，准备满血复活！Hello IO Stream!";

            // 4. 写入硬盘 (关键：String -> byte[])
            fos.write(content.getBytes());

            System.out.println("写入成功！请刷新项目目录，查看 recovery_diary.txt");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 5. 必须关闭流 (释放资源)
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}