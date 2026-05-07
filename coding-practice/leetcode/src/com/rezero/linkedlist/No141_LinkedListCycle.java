package com.rezero.linkedlist;

import com.rezero.common.ListNode;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置
 * （索引从 0 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
 * 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
 */
public class No141_LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        // 如果链表为空，或者只有一个节点且没有环，直接返回 false
        if (head == null || head.next == null) {
            return false;
        }
        // 1. 定义快慢指针
        // 慢指针一开始站在起点
        ListNode slow = head;
        // 快指针一开始站在第二格（起跑时快指针就领先一步，方便写 while 循环）
        ListNode fast = head.next;

        // 2. 只要快慢指针没有相遇，比赛就继续
        while (slow != fast) {

            // 3. 边界检查：如果快指针跑到终点了，或者快指针的下一步是终点，说明是直线赛道，没有环！
            if (fast == null || fast.next == null) {
                // 【请在这里写下对应的 return 代码】
                return false;
            }

            // 4. 让慢指针走 1 步
            slow = slow.next;

            // 5. 让快指针走 2 步
            fast = fast.next.next;

        }
        // 6. 如果 while 循环结束了（意味着 slow == fast 相遇了），说明什么？
        return true;
    }
    public static void main(String[] args) {
        // 创建有环链表示例：1 -> 2 -> 3 -> 4 -> 2（环）
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // 形成环

        No141_LinkedListCycle solution = new No141_LinkedListCycle();
        System.out.println(solution.hasCycle(head)); // 输出 true
    }

}

