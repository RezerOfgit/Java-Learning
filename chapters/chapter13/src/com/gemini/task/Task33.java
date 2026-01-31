package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task33 {
    public static void main(String[] args) {
        double d1 = 1.0;
        double d2 = 0.9;

        // 1. 普通 double 相减
        System.out.println(d1 - d2);
        // 这里的输出结果是 0.1 吗？(Yes / No)no

        // 2. 如果要精确计算 (结果必须是 0.1)，应该用 BigDecimal。
        // 下面哪种构造器是【正确】的写法？
        // A. new BigDecimal(0.9)  // 传 double
        // B. new BigDecimal("0.9") // 传 String  对
    }
}
