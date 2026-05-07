package com.rezero.linkedlist;

import com.rezero.common.ListNode;

import java.util.LinkedList;

/**
 * @author Re-zero
 * @version 1.0
 * 描述：将两个升序链表合并为一个新的 升序 链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。
 * 示例：输入：l1 = [1,2,4], l2 = [1,3,4]  输出：[1,1,2,3,4,4]
 */
public class No21_MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return dummy.next;
    }

    // ... main 方法在下面
    public static void main(String[] args) {
        No21_MergeTwoLists solution = new No21_MergeTwoLists();

        // 造链表 1: [1 -> 2 -> 4]
        ListNode l1_node1 = new ListNode(1);
        ListNode l1_node2 = new ListNode(2);
        ListNode l1_node3 = new ListNode(4);
        l1_node1.next = l1_node2;
        l1_node2.next = l1_node3;

        // 造链表 2: [1 -> 3 -> 4]
        ListNode l2_node1 = new ListNode(1);
        ListNode l2_node2 = new ListNode(3);
        ListNode l2_node3 = new ListNode(4);
        l2_node1.next = l2_node2;
        l2_node2.next = l2_node3;

        // 调用合并方法
        ListNode mergedHead = solution.mergeTwoLists(l1_node1, l2_node1);

        // 打印验证结果
        System.out.print("合并后的链表: ");
        ListNode curr = mergedHead;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
