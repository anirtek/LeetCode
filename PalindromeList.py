# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
	def isPalindrome(self, head):
		"""
			:type head: ListNode
			 :rtype: bool
			 """
			 curr = head
			 if curr is None :
			 return True
			 else :
			 s = ""
			 rev = ""
			 while curr is not None :
			 s += str(curr.val)
			 rev = str(curr.val) + rev
			 curr = curr.next
#rev = s[::-1]
#print("String = ", s, " Reverse = ", rev)
			 if(s == rev) :
				 return True
				 else :
				 return False
