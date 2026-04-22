package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review18 {
    /*
    Review 18：树化的临界点 (源码记忆) HashMap 中链表转红黑树需要满足两个条件。
     除了“链表长度达到 8”，还有一个条件是“数组容量（Capacity）必须达到 ”。
     如果不满足这个容量，会优先选择?
     完整结论：链表长度 >= 8 且 数组容量 >= 64。
     如果不满足容量要求，优先扩容，而不是树化。。
     */
}
