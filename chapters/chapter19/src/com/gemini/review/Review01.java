package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review01 {
}
/*
假设你想在 D 盘的 Java_IO_Base 文件夹里定位一个叫 test.txt 的文件，以下哪个 File 对象的写法会直接导致编译报错或运行找不到文件？
C
A. new File("D:\\Java_IO_Base\\test.txt");
B. new File("D:/Java_IO_Base/test.txt");
C. new File("D:\Java_IO_Base\test.txt");
D. new File(new File("D:\\Java_IO_Base"), "test.txt");


你想在 D 盘创建一个多级目录 D:\Java_IO_Base\level1\level2。
你写了如下代码，但运行后发现硬盘上什么都没生成，也没有报错。请问问题出在哪里？
应该如何修改？
File dir = new File("D:\\Java_IO_Base\\level1\\level2");
if (!dir.exists()) {
    dir.mkdir();
}

原因:mkdir() 方法要求父目录必须已存在，否则无法创建子目录。
解决方法:使用 mkdirs() 方法代替 mkdir()。mkdirs() 会递归创建所有不存在的父目录，从而确保整个路径被创建。
 */