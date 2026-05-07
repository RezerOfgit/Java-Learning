package com.rezero.heap;

import com.rezero.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 */
// 假设 ListNode 已经定义
public class No23_MergeKLists {
    // 遍历所有元素后排序
    public ListNode mergeKLists_my(ListNode[] lists) {
        List<ListNode> allNodes = new ArrayList<>();

        // 1. 收集所有节点
        for (ListNode head : lists) {
            while (head != null) {
                allNodes.add(head);
                head = head.next;
            }
        }

        // 2. 按 val 排序
        allNodes.sort((a, b) -> a.val - b.val);

        // 3. 重新串起来
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (ListNode node : allNodes) {
            curr.next = node;
            curr = node;
        }

        return dummy.next;
    }


    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        // 1. 定义最小堆，按照节点的值(val)升序排列
        // 这是一个 Lambda 表达式，定义 PriorityQueue 的排序规则
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // 2. 将所有链表的第一个节点放入堆中
        for (ListNode head : lists) {
            if (head != null) {
                minHeap.offer(head);
            }
        }

        // 3. 定义虚拟头节点和游标
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // 4. 不断从堆中取出最小节点，往下接
        while (!minHeap.isEmpty()) {
            // 1：从堆里弹出当前最小的节点 (poll)
            ListNode node = minHeap.poll();

            // 2：把弹出的节点接到 curr 后面，然后 curr 往前挪一步
            curr.next = node;
            curr = curr.next;

            // 3：如果刚才弹出的节点还有下一个节点 (next != null)，把它的 next 放入堆中
            if (node.next != null) {
                minHeap.offer(node.next);
            }
        }
        return dummy.next;
    }
}
