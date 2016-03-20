#Your can use Stack class in your solution.
#class Stack:
#  def __init__(self, stk=[])
#    # use stk to initialize the stack
#  def isEmpty(self)
#    # return true is stack is empty or false/
#  def push(self, item)
#    # push a element into stack and return nothing
#  def pop(self)
#    # pop a element from stack
#  def peek(self):
#    # return the top element if stack is not empty or nothing
#  def size(self):
#    # return the size of stack
class Solution:
    # @param {Stack} stk an integer Stack
    # @return {int} void
    def stackSorting(self, stk):
        # Write your code here
        tmp = Stack()
        while not stk.isEmpty():
        	if not stk.isEmpty() and (tmp.isEmpty())