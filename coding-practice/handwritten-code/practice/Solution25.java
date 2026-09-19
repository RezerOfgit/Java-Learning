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
    public ListNode reverseKGroup(ListNode head, int k) {
        // 虚拟头节点，简化第一组的处理
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy; // 当前组的前驱节点

        while (true) {
            // 1. 找到当前组的第 k 个节点
            ListNode kth = groupPrev;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }
            // 剩余节点不足 k 个，结束
            if (kth == null) break;

            ListNode groupNext = kth.next; // 下一组的起始节点

            // 2. 翻转当前组的 k 个节点（头插法）
            ListNode prev = groupNext;
            ListNode curr = groupPrev.next;
            while (curr != groupNext) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // 3. 连接前驱节点到翻转后的新头部（即原来的第 k 个节点）
            ListNode newGroupHead = groupPrev.next; // 翻转后变成组尾
            groupPrev.next = kth;                    // 组头接到前驱
            groupPrev = newGroupHead;                // 移动到下一组的前驱
        }

        return dummy.next;
    }
}