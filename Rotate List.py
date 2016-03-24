# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head: the list
    # @param k: rotate to the right k places
    # @return: the list after rotation
    def rotateRight(self, head, k):
        # write your code here
        if head is None or head.next is None:
        	return head
        start = head
        length = 0
        while head is not None:
        	head = head.next
        	length += 1
        preMove = length - k
        head.next = start
        i = 0
        while i < preMove:
        	start = start.next
        	newStart = start.next
        	i += 1
        start.next = None
        return newStart



