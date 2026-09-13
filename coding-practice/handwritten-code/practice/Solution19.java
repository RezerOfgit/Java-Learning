/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 使用虚拟头节点，简化删除头节点的边界情况
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // fast 先走 n + 1 步，使 fast 和 slow 之间相隔 n 个节点
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // fast 和 slow 同步前进，直到 fast 到达链表末尾
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // 此时 slow 指向待删除节点的前一个节点
        slow.next = slow.next.next;
        return dummy.next;
    }
}