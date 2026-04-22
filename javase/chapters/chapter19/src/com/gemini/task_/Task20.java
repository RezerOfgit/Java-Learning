package com.gemini.task_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 */

public class Task20 {
    public static void main(String[] args) {
        String filePath = "d:\\Java_IO_Base\\story.txt";
        BufferedReader bufferedReader = null;

        try {
            // 1. 先造一根原始的节点流管子
            FileReader fileReader = new FileReader(filePath);
            // 2. 把原始管子塞进“高级处理流”装甲里！(这就是包装模式/装饰者模式)
            bufferedReader = new BufferedReader(fileReader);

            // 💡 神奇的按行读取功能
            String line;
            // readLine() 方法每次直接读取一整行！如果读到文件末尾，会返回 null
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 关流大揭秘：只需要关最外层的包装流！
            // bufferedReader.close() 底层会自动帮你去关闭里面的 fileReader
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}