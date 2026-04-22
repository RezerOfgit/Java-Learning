package com.gemini.task_;

import java.io.*;

/**
 * @author Re-zero
 * @version 1.0
 * Task: 缓冲字节流拷贝 (Buffered Byte Copy)
 * 真正的万能拷贝王！图片、音频、视频全靠它！
 */
public class Task11 {
    public static void main(String[] args) {
        // 1. 指定源文件和目标文件
        // 【挑战】：如果你电脑桌面有一张真实的图片比如 "D:\\test.jpg"，你可以把路径换成图片试试！
        // 这里我们暂时还是用日记本做测试
        String srcPath = "buffered_note.txt";
        String destPath = "buffered_note_byte_copy.txt"; // 或者 test_copy.jpg

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            // 2. 搭建万能字节管道，并套上“高级增压泵”
            bis = new BufferedInputStream(new FileInputStream(srcPath));
            bos = new BufferedOutputStream(new FileOutputStream(destPath));

            System.out.println("=== 💽 启动万能字节无损复印机 ===");

            // 3. 准备字节小水桶 (1KB)
            byte[] buf = new byte[1024];
            int readLen = 0;

            // 4. 核心大循环：抽水 -> 倒水
            while ((readLen = bis.read(buf)) != -1) {
                // 注意：读了多少个字节，就写进去多少个字节！绝对不能多写！
                bos.write(buf, 0, readLen);
            }

            System.out.println("=== ✅ 万能拷贝完成！字节毫发无损！ ===");

        } catch (IOException e) {
            System.out.println("哎呀，源文件找不到啦！");
            e.printStackTrace();
        } finally {
            // 5. 关流：依旧是只需要关最外层的包装流
            try {
                if (bos != null) bos.close();
                if (bis != null) bis.close();
                System.out.println("所有管道已安全拆除。");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}