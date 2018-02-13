/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int multiplier = 1;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode temp = new ListNode(0);
        ListNode result = temp ;//result;
        int sum = 0;
        int carry = 0;
        while(curr1 != null || curr2 != null) {
            int x = (curr1 != null) ? curr1.val : 0;
            int y = (curr2 != null) ? curr2.val : 0;
            sum = carry + x + y;
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            
            if(curr1 != null) curr1 = curr1.next;
            if(curr2 != null) curr2 = curr2.next;
        }
        if(carry > 0) {
            System.out.println("Carry = " + carry);
            temp.next = new ListNode(carry);
            temp = temp.next;
        }
        return result.next; 
    }
}