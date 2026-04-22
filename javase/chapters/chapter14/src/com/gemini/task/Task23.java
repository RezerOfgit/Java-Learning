package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task23 {
    /*
    对应进度：P536 (底层机制) 背景： 要把一个巨大的哈希值映射到数组下标（比如 0-15），
    通常我们会想到取模运算 hash % n。 但是 HashMap 源码里用的却是位运算：
    index = (n - 1) & hash。

题目： 这个位运算公式 (n - 1) & hash 能等价替换取模运算 hash % n，
有一个强制的前提条件，这个条件也是为什么 HashMap 的容量（Capcity）
必须永远是 2 的倍数（16, 32, 64...）的原因。 请问这个条件是？C

A. n 必须是奇数。
B. n 必须是质数。
C. n 必须是 2 的 n 次幂 (Power of 2)。
     */
}
