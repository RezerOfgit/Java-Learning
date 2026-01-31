package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review21 {
    /*
    考察点：TreeSet/TreeMap 的去重与排序机制。
    题目： TreeSet 判断两个元素是否重复（以及谁排在前面），
    不依赖 hashCode() 和 equals()，而是依赖：B

A. 元素的内存地址

B. 元素实现的 Comparable 接口（compareTo 方法）或者构造器传入的 Comparator 比较器

C. 元素的 toString() 长度
     */
}
