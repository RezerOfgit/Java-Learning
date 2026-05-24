/**
 * LeetCode 160. 相交链表
 * 给你两个单链表的头节点 headA 和 headB，
 * 请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null。
 * 假设整个链表结构中没有环。
 * 函数应该返回两个链表相交的节点引用，而不是节点值。
 */
public class No160_IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pA = headA;
        ListNode pB = headB;

        // 当 pA 和 pB 不相等时，继续遍历
        while (pA != pB) {
            // 如果 pA 走到尽头，就切换到 headB 继续走；否则走下一步
            pA = (pA == null) ? headB : pA.next;
            // pB 同理
            pB = (pB == null) ? headA : pB.next;
        }

        // 此时 pA 和 pB 要么在相交节点相遇，要么都为 null（无相交）
        return pA;
    }
}