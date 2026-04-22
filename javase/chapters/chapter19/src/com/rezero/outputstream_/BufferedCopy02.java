package com.rezero.outputstream_;

import java.io.*;

/**
 * @author Re-zero
 * @version 1.0
 * 演示使用BufferedOutputStream 和 BufferedInputStream使用
 * 思考:字节流可以操作二进制文件,可以操作文本文件吗?可以
 */
public class BufferedCopy02 {
    public static void main(String[] args) {
        String srcFilePath = "d:\\壁纸.jpg";
        String destFilePath = "d:\\picture.jpg";

        //创建BufferedOutputStream对象BufferedInputStream对象
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //因为 FileInputStream 是 InputStream 子类
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            //循环的读取文件，并写入到 destFilePath
            byte[] buf = new byte[1024];
            int readLen = 0;
            //当返回-1 时，就表示文件读取完毕
            while ((readLen = bis.read(buf)) != -1) {
                bos.write(buf, 0, readLen);
            }
            System.out.println("文件复制完毕.....");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
