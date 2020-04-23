/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slowptr = head;
        ListNode fastptr = head;
        while (fastptr.next != null) {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if (fastptr == null) break;
        }
        return slowptr;
    }
}