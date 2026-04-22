package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task02 {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};

    public void change(String str, char[] ch) {
        str = "java";     // 1. 这里试图修改 String,String是不可变的
        ch[0] = 'h';      // 2. 这里试图修改 数组
    }

    public static void main(String[] args) {
        Task02 ex = new Task02();
        ex.change(ex.str, ex.ch);

        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);//hsp and hava
    }
}
