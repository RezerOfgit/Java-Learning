package com.rezero.homework;

/**
 * @author Re-zero
 * @version 1.0
 */
public class H01modify {
    public static void main(String[] args) {
        //测试
        String str = "abcdef";
        int start = str.indexOf('b');
        int end = str.indexOf('e');
        System.out.println("===交换前===");
        System.out.println(str);
        try {
            str = reverse(str, start, end);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("===交换后===");
        System.out.println(str);
    }

    public static String reverse(String str, int start, int end) {
        //对输入的参数做一个验证
        //重要的编程技巧！！！
        //(1) 写出正确的情况
        //(2) 然后取反即可
        if (!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';//交换辅助变量
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        //使用chars 重新构建一个String 返回即可
        return new String(chars);
    }
}
