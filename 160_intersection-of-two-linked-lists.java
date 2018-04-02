/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null) {
			return null;
		}
		ListNode p1 = headA;
		ListNode p2 = headB;
		while(p1 != null || p2 != null) {
			p1 = p1.next;
			p2 = p2.next;
			if(p1 == null) {
				p1 = headB;
			}
			if(p2 == null) {
				p2 = headB;
			}
			if(p1.next == p2.next) {
				return p1.next;
			}
		}
		return null;
	}
} 


/**
 * Another solution :
 */
 
 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        } 
        HashMap<ListNode, Boolean> mapA = new HashMap<>();
        ListNode p1 = headA;
        ListNode p2 = headB;
        /* Add first list into the map */
        while(p1 != null) {
            mapA.put(p1, true);
            p1 = p1.next;
        }
        /* Add second list into the map */
        while(p2 != null) {
            if(mapA.containsKey(p2)) {
                return p2;
            }
            p2 = p2.next;
        }
        return null;
	}
}
