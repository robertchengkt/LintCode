"""
Definition of TreeNode:
class TreeNode:
    def __init__(self, val):
        this.val = val
        this.left, this.right = None, None
"""
class Solution:
    """
    @param root, the root of binary tree.
    @return true if it is a mirror of itself, or false.
    """
    def isSymmetric(self, root):
        # Write your code here
        if root:
        	return self.helper(root.left, root.right) and self.helper(root.right, root.left)
        return True

    def helper (self, left, right):
    	if left == None and right == None: return True 
    	if left and right and left.val == right.val:
    		return self.helper(left.right, right.left) and self.helper(left.left, right.right)
    	return False