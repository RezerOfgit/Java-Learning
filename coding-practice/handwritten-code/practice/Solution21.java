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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 虚拟头节点，简化边界处理
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // 同时遍历两个链表，按大小依次接入结果链表
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // 将剩余未遍历完的链表直接接到末尾
        current.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}