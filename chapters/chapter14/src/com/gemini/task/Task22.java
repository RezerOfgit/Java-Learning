package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task22 {
    /*
    对应进度：P536-P537 (HashMap 源码解读) 背景： 在 HashMap 的源码中，
    计算哈希值的方法 hash(Object key) 并不是直接返回 key.hashCode()，
    而是做了一步奇怪的运算：
    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);

题目： 韩老师在视频里解释过，为什么要把哈希值右移 16 位，然后再和自己做异或 (^) 运算？B

A. 为了把哈希值变成正数。
B. 为了让高 16 位的信息也参与运算，防止计算索引时只利用了低位，导致冲突增加。
C. 没有任何意义，只是为了让代码看起来更高级。
     */
}
