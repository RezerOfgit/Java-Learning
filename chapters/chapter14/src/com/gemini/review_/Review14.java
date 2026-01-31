package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review14 {
    /*
    考察点：底层 Node (或 Entry) 到底存了啥。
    题目： 我们在 Debug 时看到的那个“糖葫芦”节点（链表节点），
    除了存储我们放入的 Key (对于 HashSet 来说) 和指向下一个节点的 Next 引用外，
    它必须还存储了哪个关键字段，用于在发生冲突时快速判断“是不是找错人了”？B

A. value (对于 HashSet 是个固定值)

B. hash (Key 的哈希值)

C. index (数组下标)
     */
}
