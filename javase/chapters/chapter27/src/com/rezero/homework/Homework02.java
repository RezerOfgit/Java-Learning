package com.rezero.homework;

/**
 * @author Re-zero
 * @version 1.0
 * 2.要求验证是不是整数或者小数 Homework02.java
 * 提示：这个题要考虑正数和负数
 * 比如:123-34534.89-87.9-0.010.45等
 */
public class Homework02 {
    public static void main(String[] args) {
        String content = "-87.9";
        String regStr = "^[-+]?([1-9]\\d*|0)(\\.\\d+)?$";

        if (content.matches(regStr)) {
            System.out.println("匹配成功, 是整数或者小数");
        } else {
            System.out.println("匹配失败");
        }
    }
}
