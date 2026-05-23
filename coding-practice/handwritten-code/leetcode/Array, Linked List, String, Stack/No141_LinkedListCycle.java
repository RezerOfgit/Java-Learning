/**
 * LeetCode 141. 环形链表
 * 给你一个链表的头节点 head，判断链表中是否有环。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 返回值：如果链表中存在环，返回 true；否则返回 false。
 */
public class No141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;  // 空链表或单节点无环
        }

        ListNode slow = head;
        ListNode fast = head;

        // 快指针每次走两步，慢指针每次走一步
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // 如果快慢指针相遇，说明有环
            if (slow == fast) {
                return true;
            }
        }

        // 快指针到达链表末尾（null），说明无环
        return false;
    }
}