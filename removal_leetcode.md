
**Intuition**

Keep track of the previous and current node of the list. On the match found, previous node is connected with the next of current.

**Algorithm**

We received head of the list in the method we have to write logic in. Take a dummy node which will keep traversing with the current node with a distance of 1 and this dummy node will point to the previous node of which current is pointing to. Lets call this node as "prev" and current node as "curr". We will run a while loop until "curr" becomes null. If the value to be deleted is matched with the current node value, we take a node "temp" which will point to the next of "curr" and set next of "prev" to "temp" followed by repositioning "curr" to "temp". Otherwise, the "prev" is set to "curr" and current node is forwarded by one position. Please note that, by doing this operation we are actually just changing the links of the nodes and not deleting the node assuming that after doing this, the garbage collector of Java will remove the disconnected nodes in the list, which we can be sure of happening.

One important boundary condition to be checked is - If the very first node or many nodes series are found same as val (the data to be deleted), we need to run a while loop unless and until head becomes null or head value does not match any further with the value to be removed.

The pseudocode is as following:
* Loop through list until head is not null and head.val == val
	Update head to head.next
* Initialize curr node to head of the list
* Create a new node prev with value 0
* Set prev.next = curr
* Loop through list until curr is not null 
	1. If curr.val == val then
	2.	ListNode temp = curr.next
	3. 	prev.next = temp
	4. 	Update current node as curr = temp
	5. Else
	6.	Update previous as prev = current 
	7. 	Update current node as curr = curr.next
* return head

Take extra caution of the following cases:

| Testcases       | Result | Explanation                                                                                                                        |
|-----------------|--------|------------------------------------------------------------------------------------------------------------------------------------|
| [1,1] 1         | []     | Since the 1 is to be deleted, the first while loop will updated head node and make to null. Hence the list is empty.               |
| [] 1            | []     | There is no element in the list hence we need to check is head is not null. If head is found null, same is returned by the method. |
| [6,1,1,1,1,2] 1 | [6,2]  | The number 1 is found repeatedly in the list in series, so all of them should be deleted.                                          |


**Java**

```java
class Solution {
    public ListNode removeElements(ListNode head, int val) {
            while(head != null && head.val == val) 
                head = head.next;
        ListNode curr = head;
        ListNode prev = new ListNode(0);
        prev.next = curr;
        
        while(curr != null) { 
            if(curr.val == val) { 
                ListNode temp = curr.next;
                prev.next = temp;
                curr = temp;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
```

**Complexity Analysis**

* Time complexity : $$O(n)$$. The deletion is performed by traversing over the entire linked list right from head element till the lastmost element of the list. Since the linked list is a sequential accessed data structures, unlike array where data is contiguous in memory, we can not apply any algorithm to find the element to be deleted like in binary search.  


* Space complexity : $$O(1)$$. We need $$O(1)$$ space because we are pointing next node by a "temp" and the deletion is performed inplace. We have also created a previous node with the dummy value as 0.

---