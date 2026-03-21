package com.rezero.linkedlist;

import com.rezero.common.ListNode;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5] （删掉了倒数第 2 个节点，也就是 4）
 * 💡 破局思路：前后双指针（保持固定距离的两人赛跑）
 */
public class No19_RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 1. 创建虚拟头节点 dummy，专门为了防止要把 head 自己删掉的情况
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        // 2. 初始化双指针，都站在起跑线 dummy 上
        ListNode fast = dummy;
        ListNode slow = dummy;

        // 3. 让 fast 先跑 n 步，拉开距离
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // 4. 两人同时起跑，一直走到 fast 变成了最后一个节点（fast.next == null）
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // 5. 此时 slow 刚好停在被删节点的前面。执行“越过”操作！
        slow.next = slow.next.next;

        // 6. 返回真正的头节点
        return dummy.next;
    }
}
