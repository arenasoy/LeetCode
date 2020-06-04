package problems;

public class DeleteNodeInALinkedList0237 {
    
    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public void deleteNode(ListNode node) {
        
        while (node.next != null && node.next.next != null) {
            int val = node.next.val;
            node.val = val;
            node = node.next;
        }
        
        if (node.next != null) {
            node.val = node.next.val;
            node.next = null;
        }
    }
}