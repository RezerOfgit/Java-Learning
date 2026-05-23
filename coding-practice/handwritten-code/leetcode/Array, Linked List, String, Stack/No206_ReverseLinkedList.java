/**
 * LeetCode 206. 反转链表 (迭代法)
 * 给你单链表的头节点 head，请你反转链表，并返回反转后的链表。
 */
public class No206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;   // 已反转部分的头节点
        ListNode curr = head;   // 当前待处理的节点

        while (curr != null) {
            ListNode nextTemp = curr.next;  // 暂存下一个节点，防止断链
            curr.next = prev;               // 当前节点指向前一个节点，完成反转
            prev = curr;                    // prev 前移
            curr = nextTemp;                // curr 继续处理下一个节点
        }

        // 循环结束时，prev 指向原链表的最后一个节点，即新链表的头节点
        return prev;
    }
}