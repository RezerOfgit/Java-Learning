package com.rezero.no206;

/**
 * @author Re-zero
 * @version 1.0
 */
public class ReverseList {
    public static void main(String[] args) {

    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // 上一个节点，初始为 null
        ListNode curr = head; // 当前正在处理的节点

        // 当 curr 不为空时，说明还没走到链表尽头
        while (curr != null) {
            // 1. 记住原来的下一个节点，防止迷路
            ListNode nextTemp = curr.next;

            // 2. 关键动作：转身！当前节点指向前一个节点
            curr.next = prev;

            // 3. prev 指针往前走一步，来到 curr 的位置
            prev = curr;

            // 4. curr 指针往前走一步，来到 nextTemp 的位置
            curr = nextTemp;
        }

        // 循环结束时，curr 变成了 null，此时 prev 正好停在原链表的最后一个节点，
        // 也就是新链表的头节点。
        return prev;
    }
}
// 这是 LeetCode 官方使用的链表节点类定义
class ListNode {
    int val;          // 节点里存储的数据 (Value)
    ListNode next;    // 指向下一个节点的“指针”/引用 (Next)

    // 下面是三个构造方法，方便创建节点
    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}