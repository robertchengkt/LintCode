# Binary Tree Maximum Path Sum II

"""
Definition of TreeNode:
class TreeNode:
    def __init__(self, val):
        this.val = val
        this.left, this.right = None, None
"""
class Solution:
    """
    @param root the root of binary tree.
    @return an integer
    """
    def maxPathSum2(self, root):
        # Write your code here
        stack = [root]
        result = []
        sumNum = 0
        sums = []
        while stack:
           root = stack.pop()
           if root.val >= 0 && root not in result:
				sumNum += root.val
				result.append(root)
           while root.left:
               stack.append(root.left)
           while root.right:
           		stack.append(root.right)
