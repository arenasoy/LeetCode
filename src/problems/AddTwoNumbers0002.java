package problems;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class AddTwoNumbers0002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode res = new ListNode(-1);
        ListNode ret = new ListNode(-1);
        int carry = 0;
        
        while (cur1 != null || cur2 != null) {
            
            int result = carry;
            if (cur1 != null)
                result += cur1.val;
            if (cur2 != null)
                result += cur2.val;
            
            carry = 0;
            if (result >= 10) {
                result -= 10;
                carry = 1;
            }
            
            ListNode node = new ListNode(result);
            
            if (res.val >= 0) {
                res.next = node;
            } else {
                ret = node;
            }
            
            res = node;
            
            if (cur1 != null)
                cur1 = cur1.next;
            if (cur2 != null)
                cur2 = cur2.next;
            
        }
        
        if (carry == 1) {
            ListNode node = new ListNode(1);
            res.next = node;
        }
        
        return ret;
    }

}