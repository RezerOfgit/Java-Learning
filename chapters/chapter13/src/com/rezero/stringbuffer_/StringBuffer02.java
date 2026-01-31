package com.rezero.stringbuffer_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class StringBuffer02 {
    public static void main(String[] args) {
        //构造器的使用
        //解读
        //1. 创建一个 大小为16 的char[],用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();

        //2. 通过构造器指定 char[] 大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

        //3. 通过 给一个String 创建 StingBuffer, char[] 大小就是 str.length() + 16
        StringBuffer hello = new StringBuffer("hello");
    }
}
