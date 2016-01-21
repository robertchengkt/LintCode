"""
Definition of TreeNode:
class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left, self.right = None, None
"""

# recursive
class Solution:
    """
    @param root: The root of binary tree.
    @return: Preorder in ArrayList which contains node values.
    """
    def traversal(self, root, result):
        if root:
            result.append(root.val)
            self.traversal(root.left, result)
            self.traversal(root.right, result)

    def preorderTraversal(self, root):
        # write your code here
        result = []
        self.traversal(root, result)
        return result


# non-recursive

class Solution:

    def preorderTraversal(self, root):

        if root is None:
            return []

        stack = [root]
        result = []

        while stack:
            root = stack.pop()
            result.append(root.val)
            while root.left:
                stack.append(root.left)
                result.append(root.val)
            while root.right:
                stack.append(root.right)
                result.append(root.val)
        return result

