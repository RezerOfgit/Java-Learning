package com.rezero.printstream;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author Re-zero
 * @version 1.0
 * 演示PrintStream (字节打印流/输出流)
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {

        PrintStream out = System.out;
        //在默认情况下，PrintStream 输出数据的位置是 标准输出，即显示器
        /*
            public void print(String s) {
                if (s == null) {
                    s = "null";
                }
                write(s);
            }
         */
        out.println("john, hello");
        //因为print底层使用的是write ，所以我们可以直接调用write进行打印/输出
        out.write("你好,打印输出流".getBytes());
        out.close();

        //我们可以去修改打印流输出的位置/设备
        //1. 修改成到"d:\\f1.txt"
        //2. hello, 你好,打印输出流  就会输出到 d:\f1.txt
        //3. public static void setOut(PrintStream out) {
        //        checkIO();
        //        setOut0(out);// native 方法，修改了out
        //    }
        System.setOut(new PrintStream("d:\\f1.txt"));
        System.out.println("hello, 你好,打印输出流");
    }
}
