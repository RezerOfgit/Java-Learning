package com.gemini.task16;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task16 {
    public static void main(String[] args) {
        // 模拟从数据库读出来的脏数据，前面带了个空格，还混进去了非数字
        String priceTag = " 123 ";

        // 目标：把字符串转成整数，然后 * 2
        // 现在的代码运行会直接崩，请动手修复它
        try {
            int price = Integer.parseInt(priceTag.trim());

            System.out.println("商品总价：" + (price * 2));
        } catch (NumberFormatException e) {
            System.out.println("字符串不是有效整数");
        }
    }
}
