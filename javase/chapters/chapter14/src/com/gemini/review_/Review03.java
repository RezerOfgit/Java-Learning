package com.gemini.review_;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Re-zero
 * @version 1.0
 * BigDecimal 的精度问题。
 * 题目： 下面的代码会抛出异常，为什么？
 * 请用一句话解释原因，并给出修复方案（代码形式）。
 */
public class Review03 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("10");
        BigDecimal b = new BigDecimal("3");
        // 报错：ArithmeticException
        //System.out.println(a.divide(b));
        //无限循环小数,未指定保留位数,报错
        System.out.println(a.divide(b,2, RoundingMode.CEILING));
    }
}
