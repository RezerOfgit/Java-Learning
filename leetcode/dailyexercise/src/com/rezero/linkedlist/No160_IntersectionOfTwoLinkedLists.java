package com.rezero.linkedlist;

import com.rezero.common.ListNode;

/**
 * @author Re-zero
 * @version 1.0
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。
 * 如果两个链表不存在相交节点，返回 null。
 */
public class No160_IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 1. 如果其中有一个链表是空的，那肯定不可能相交
        if (headA == null || headB == null) {
            return null;
        }

        // 2. 定义两个指针，分别从两个链表头开始出发
        ListNode pA = headA;
        ListNode pB = headB;

        // 3. 只要他们俩还没有相遇（还没有指向同一个节点），就一直往下走
        while (pA != pB) {
            // 4. 指针 pA 的走法：
            // 如果 pA 还没走到尽头 (null)，就老老实实往下走一步 (pA.next)；
            // 如果 pA 已经走到了尽头 (null)，就让他“穿越”到链表 B 的头部 (headB)！
            if (pA != null) {
                pA = pA.next;
            }else {
                pA = headB;
            }
            // 5. 指针 pB 的走法：
            // 同理，如果 pB 没走到尽头，就走下一步；如果走到了尽头，就穿越到链表 A 的头部！
            if (pB != null) {
                pB = pB.next;
            } else {
                pB = headA;
            }
        }

        // 6. 循环结束的条件是 pA == pB。
        // 这时他们要么停在相交的那个路口，要么双双变成了 null（不相交）。直接返回其中一个即可。
        return pA;
    }
}
