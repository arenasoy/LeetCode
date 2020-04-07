package problems;

public class MergeTwoLists0021 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     
        ListNode cur;
        ListNode result;
        
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        
        if (l1.val < l2.val) {
            cur = l1;
            l1 = l1.next;
        } else {
            cur = l2;
            l2 = l2.next;
        }
        
        result = cur;
        
        while(l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            
            cur = cur.next;   
        }
        
        while (l1 != null) {
            cur.next = l1;
            l1 = l1.next;
            cur = cur.next;
        }
        
        while (l2 != null) {
            cur.next = l2;
            l2 = l2.next;
            cur = cur.next;
        }
        
        return result;
    }

}