package com.rezero.file;

import org.junit.Test;

import java.io.*;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Directory_ {
    public static void main(String[] args) {

    }

    //判断 d:\\news1.txt 是否存在，如果存在就删除
    @Test
    public void m1() {
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功...");
            } else {
                System.out.println(filePath + "删除失败...");
            }
        } else {
            System.out.println("该文件不存在...");
        }
    }

    //判断 D:\\demo02 是否存在，存在就删除，否则提示不存在
    //这里我们需要体会到，在java编程中，目录也被当做文件
    @Test
    public void m2() {
        String filePath = "d:\\demo02";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功...");
            } else {
                System.out.println(filePath + "删除失败...");
            }
        } else {
            System.out.println("该文件不存在...");
        }
    }

    //判断 D:\\demo\\a\\b\\c目录是否存在，如果存在就提示已经存在，否则就创建
    @Test
    public void m3() {
        String directoryPath = "d:\\demo\\a\\b\\c";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(directoryPath + "存在...");
        } else {
            if (file.mkdirs()) {
                System.out.println(directoryPath + "创建成功...");
            } else {
                System.out.println(directoryPath + "创建失败...");
            }
        }
    }

    //下面4个都是抽象类
    //OutputStream
    //InputStream
    //Reader  //字符输入流
    //Writer  //字符输出流
}
