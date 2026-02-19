package com.gemini.task_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 * Task: 缓冲字符输出流体验 (BufferedWriter)
 * 告别手动写换行符，跨平台书写利器！
 */
public class Task09 {
    public static void main(String[] args) {
        // 1. 指定目标文件
        String filePath = "buffered_note.txt";

        // 声明在外面，方便 finally 里关闭
        BufferedWriter bw = null;

        try {
            // 2. 创建缓冲处理流
            // 注意看这里的嵌套逻辑：
            // new FileWriter(filePath, true) -> 负责底层的真实写入，并开启追加模式
            // new BufferedWriter(...) -> 负责提供高级的包装和缓冲功能
            bw = new BufferedWriter(new FileWriter(filePath, true));

            System.out.println("=== 📝 启动高级打字机 ===");

            // 3. 开始丝滑地写入
            bw.write("🌟 第一句：这是用 BufferedWriter 写入的文字。");

            // 4. 核心魔法：跨平台换行！
            bw.newLine();

            bw.write("🌟 第二句：有了 newLine() 方法，再也不用纠结写 \\n 还是 \\r\\n 啦！");
            bw.newLine();

            bw.write("🌟 第三句：夜深了，敲完这行代码就去睡觉！");
            bw.newLine();

            System.out.println("=== 📝 打字完毕，准备切断电源 (关流) ===");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 5. 关流终极奥义：只需关闭最外层的包装流
            try {
                if (bw != null) {
                    bw.close(); // 底层会自动去调用 FileWriter 的 close()
                    System.out.println("✅ 流已关闭，数据安全写入磁盘。");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}