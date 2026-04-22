package com.rezero.homework;

/**
 * @author Re-zero
 * @version 1.0
 * 输入字符串，判断里面有多少个大写字母，多少个小写字母，多少个数字
 */
public class Homework04 {
    public static void main(String[] args) {
        statCount("qweFF87455");
    }
    public static void statCount(String str){
        if (str == null) {
            System.out.println("输入不能为空");
            return;
        }
        char[] chars = str.toCharArray();
        int upCount = 0;//大写字母数量统计
        int lowCount = 0;//小写字母数量统计
        int numsCount = 0;//数字数量统计

        //str.charAt(i) >= 'a' && str.charAt(i) <= 'z'
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                upCount++;
            }
            if (chars[i] >= 97 && chars[i] <= 122){
                lowCount++;
            }
            if (chars[i] >= 48 && chars[i] <= 57){
                numsCount++;
            }
        }
        System.out.println("大写字母数量=" + upCount + "\n小写字母数量=" + lowCount +
                "\n数字数量=" + numsCount);
    }
}
