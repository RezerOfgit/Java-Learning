package com.rezero.homework;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Homework01 {
    /*
    (1)将字符串中指定部分进行反转。比如将”abcdef“反转为”aedcbf"
    (2)编写方法public static String reverse(String str, int start，int end)搞定
     */
    public static void main(String[] args) {
        String str = "abcdef";
        int start = str.indexOf('b');
        int end = str.indexOf('e');
        String newstr = reverse(str, start, end);
        System.out.println(newstr);
    }

    public static String reverse(String str, int start, int end) {
        String substr = str.substring(start, (end + 1));//bcde
        char[] chs = substr.toCharArray();
        for (int i = 0; i < chs.length / 2; i++) {
            char temp = chs[i];
            chs[i] = chs[chs.length - 1 - i];
            chs[chs.length - 1 - i] = temp;
        }
        //将char数组转换为String字符串
        // 方法1
        //String newsubstr = String.valueOf(chs);
        // 方法2
        String newsubstr = new String(chs);
        str = str.replace(substr,newsubstr);
        return str;
    }
}
