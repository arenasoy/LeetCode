package problems;

public class MiddleOfTheLinkedList0876 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode middleNode(ListNode head) {
        
        if (head == null)
            return null;
        
        ListNode one = head;
        ListNode two = head;
        
        while (two.next != null) {
            one = one.next;
            two = two.next;
            
            if (two.next != null)
                two = two.next;
        }
        
        return one;
    }

}