package problems;

public class IntersectionOfTwoLinkedLists0160 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int sizeA = 0;
        int sizeB = 0;

        ListNode cur = headA;
        while (cur != null) {
            sizeA++;
            cur = cur.next;
        }
        
        cur = headB;
        while (cur != null) {
            sizeB++;
            cur = cur.next;
        }
        
        int diff;
        ListNode bigger;
        
        if (sizeB > sizeA) {
            diff = sizeB - sizeA;
            bigger = headB;
            cur = headA;
            for (int i = 0; i < diff; i++)
                bigger = bigger.next;
        } else {
            diff = sizeA - sizeB;
            bigger = headA;
            cur = headB;
            for (int i = 0; i < diff; i++)
                bigger = bigger.next;
        }
        
        while (cur != null) {
            if (bigger == cur) {
                return cur;
            }
            bigger = bigger.next;
            cur = cur.next;
        }
        
        return null;
    }
}