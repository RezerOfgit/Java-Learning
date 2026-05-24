/**
 * LeetCode 19. 删除链表的倒数第 N 个结点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * n 保证有效。
 */
public class No19_RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 使用虚拟头节点，统一处理删除头结点的情况
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // fast 先走 n+1 步，使得 fast 和 slow 之间相隔 n 个节点
        // 当 fast 走到末尾 null 时，slow 正好指向倒数第 n+1 个节点，即待删除节点的前驱
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // 同时移动 fast 和 slow，直到 fast 为 null
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // 删除 slow.next 节点
        slow.next = slow.next.next;

        return dummy.next;
    }
}