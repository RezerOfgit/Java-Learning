package com.rezero.outputstream_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 * 在实际开发中，关流的顺序一般遵循*“先开后关，后开先关”*的原则。
 * 也就是说，因为你先 new 的是 fileInputStream，后 new 的是 fileOutputStream，
 * 所以在 finally 里最好先关 fileOutputStream。
 */
public class FileCopy {
    public static void main(String[] args) {
        //完成文件拷贝，将e:\\news.txt 拷贝d:\\
        //思路分析
        //1. 创建文件的输入流, 将文件读入到程序
        //2. 创建文件的输出流, 将读取到的文件数据, 写入到指定的文件
        String srcFilePath = "e:\\news.txt";
        String destFilePath = "d:\\news.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            //定义一个字节数组, 提高读取效果
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1) {
                //读取到后,就写入到文件 通过 fileOutputStream
                //即, 是一边读, 一边写
                fileOutputStream.write(buf, 0, readLen);//一定要使用这个方法

            }
            System.out.println("拷贝ok...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭输入流和输出流, 释放资源
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
