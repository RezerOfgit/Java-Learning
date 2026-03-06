package com.rezero.common;

/**
 * @author Re-zero
 * @version 1.0
 */
// 这是 LeetCode 官方使用的链表节点类定义
public class ListNode {
    public int val;          // 节点里存储的数据 (Value)
    public ListNode next;    // 指向下一个节点的“指针”/引用 (Next)

    // 下面是三个构造方法，方便创建节点
    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
