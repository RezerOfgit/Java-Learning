package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review17 {
    /*
    考察点：为什么 EntrySet 更快？ 题目： 当 Map 数据量很大时，
    推荐使用 entrySet 遍历而不是 keySet。 原因是：B
A. entrySet 代码写起来更短。
B. keySet 需要遍历两次（一次拿 Key，一次回 Map 查 Value），
而 entrySet 是一次性把键值对都拿出来了。
     */
}
