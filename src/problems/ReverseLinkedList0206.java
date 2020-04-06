package problems;

public class ReverseLinkedList0206 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        
        if (head == null) return null;
        
        ListNode prev = head;
        ListNode cur = head.next;
        ListNode next;
        
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        
        head.next = null;
        return prev;
    }
}