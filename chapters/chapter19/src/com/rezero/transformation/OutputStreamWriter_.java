package com.rezero.transformation;

import java.io.*;

/**
 * @author Re-zero
 * @version 1.0
 * 演示 OutputStreamWriter 使用
 * 把FileOutputStream 字节流，转成字符流 OutputStreamWriter
 * 指定处理的编码 gbk/utf-8/utf8
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\hello11.txt";
        String charSet = "utf-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
        osw.write("你好,hello");
        osw.close();
        System.out.println("按照 " + charSet + "保存文件成功~");
    }
}
