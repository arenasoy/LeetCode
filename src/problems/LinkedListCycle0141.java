package problems;

public class LinkedListCycle0141 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public boolean hasCycle(ListNode head) {

            ListNode one = head;
            ListNode two = head;

            if (head == null)
                return false;

            do {
                one = one.next;

                if (one == null)
                    return false;

                two = two.next;
                if (two == null)
                    return false;
                two = two.next;

            } while (two != one && two != null);

            if (two == null || one == null)
                return false;

            return true;
        }
    }

}
