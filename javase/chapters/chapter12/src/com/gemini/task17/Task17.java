package com.gemini.task17;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task17 {
    public static void main(String[] args) {
        Object box = new Integer(999);
        // 箱子里实际装的是一把“数字剑” (Integer)

        // 程序员以为箱子里装的是“文字说明书” (String)
        // 于是他自信地进行了强转
        try {
            String instruction = String.valueOf(box);//字符类型转换错误

            System.out.println("读取说明书：" + instruction);
        } catch (Exception e) {
            System.out.println("字符类型转换错误");
        }
        System.out.println("读取完毕");
    }
}