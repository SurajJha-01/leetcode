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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Extra dummy node making
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // start both dummy pointer
        ListNode slow = dummy;
        ListNode fast = dummy;

        // Fast ko n steps aage bhejo
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Dono ko saath-saath chalayenge
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Nth node ko remove karenge
        slow.next = slow.next.next;

        // Updated head return karenge
        return dummy.next;
    }
}
