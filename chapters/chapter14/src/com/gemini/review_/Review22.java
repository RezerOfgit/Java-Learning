package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review22 {
    /*
    考察点：Task 29 和 S11 的延伸。
    今天我们发现如果只比较长度，"Bob" 进不去。
题目： 如果我们既想按长度排序（短在前），又想保留长度相同但内容不同的字符串
（比如同时存下 "Tom" 和 "Bob"）。 在 compare 方法中，
当 len1 == len2 时，不应该返回 0，而应该接着比什么？B

A. 直接返回 1 (放在后面)

B. 调用 s1.compareTo(s2) (按字典序再比一次)

C. 抛出异常
     */
}
