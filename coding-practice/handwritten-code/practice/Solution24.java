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
    public ListNode swapPairs(ListNode head) {
        // 虚拟头节点，指向 head，便于处理头两个节点的交换
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // 每次循环处理一对节点
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = first.next;

            // 交换 first 和 second
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // prev 移动到下一对节点的前驱位置
            prev = first;
        }

        return dummy.next;
    }
}