package com.rezero.linkedlist;

import com.rezero.common.ListNode;

/**
 * @author Re-zero
 * @version 1.0
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
public class No206_ReverseLinkedList {

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

    public static void main(String[] args) {
        // 1. 造出当前题目的对象
        No206_ReverseLinkedList solution = new No206_ReverseLinkedList();

        // 2. 准备测试数据：手动造一个 1 -> 2 -> 3 -> null 的链表
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        System.out.println("反转前，头节点的值是：" + node1.val);

        // 3. 调用你想测试的反转方法，它会返回一个新的头节点
        ListNode newHead = solution.reverseList(node1);

        // 4. 打印验证结果：遍历新链表
        System.out.print("反转后的链表：");
        ListNode curr = newHead;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next; // 指针往后挪
        }
        System.out.println("null");
    }
}
