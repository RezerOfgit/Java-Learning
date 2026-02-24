package com.rezero.file;

import org.hamcrest.Condition;
import org.junit.Test;
import java.io.File;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 * 演示创建文件
 */
public class FileCreate {
    public static void main(String[] args) {

    }
    //方式1 new File(String pathname)
    @Test
    public void create01(){
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式2 new File(File parent, String child) //根据父目录文件+子路径构建
    //d:\\news2.txt
    @Test
    public void creat02(){
        File parentFile = new File("d:\\");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //方式3 new File(String parent,String child)//根据父目录+子路径创建
    @Test
    public void creat03(){
        //String parentPath = "e:/";
        String parentPath = "e:\\";
        String fileName = "news.txt";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
