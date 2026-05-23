/**
 * LeetCode 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的升序链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class No21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 创建虚拟头节点，简化边界处理
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        // 当两个链表都有节点时，比较值大小，将较小的节点接到 curr 后面
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;  // curr 指针始终保持在已合并链表的末尾
        }

        // 处理剩余节点：至多一个链表还有剩余，直接接到末尾
        curr.next = (list1 != null) ? list1 : list2;

        // dummy.next 是合并后的头节点
        return dummy.next;
    }
}