package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review02 {
}
/*
假设你的 D:\Java_IO_Base 目录下有一个空的 log.txt 文件。
依次运行了两段互相独立的代码（注意看参数的区别）：

代码 A（先运行）：
FileOutputStream fos1 = new FileOutputStream("D:\\Java_IO_Base\\log.txt");
fos1.write("Hello".getBytes());
fos1.close();

代码 B（紧接着运行）：
FileOutputStream fos2 = new FileOutputStream("D:\\Java_IO_Base\\log.txt", true);
fos2.write("World".getBytes());
fos2.close();

请问，两段代码运行完毕后，你打开 log.txt，里面最终显示的文本内容是什么？C
A. Hello
B. World
C. HelloWorld
D. 报错，文件被占用
 */