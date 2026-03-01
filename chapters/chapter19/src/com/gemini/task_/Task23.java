package com.gemini.task_;

import java.io.*;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task23 {
    public static void main(String[] args) {
        String srcFilePath = "D:\\Java_IO_Base\\testPic.jpg";
        String destFilePath = "D:\\Java_IO_Base\\testPic_copy.jpg";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            byte[] buf = new byte[1024];
            int readLen = 0;

            while ((readLen = bis.read(buf)) != -1) {
                bos.write(buf, 0, readLen);
            }
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
