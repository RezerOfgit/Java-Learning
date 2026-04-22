package com.gemini.task_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task27 {
    public static void main(String[] args) {
        System.out.println(System.in.getClass());
        System.out.println(System.out.getClass());
        //使用 System.out 这个对象，调用它的 .write() 方法，
        // 直接往控制台写几个字节内容（比如向屏幕输出你的英文名），看看能不能打印出来。
        //能打印：只能是 byte[] 或 int。
        System.out.write(66);
    }
}
