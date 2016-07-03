"""
Definition of TreeNode:
class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left, self.right = None, None
"""
class Solution:
    """
    @param root: The root of the binary search tree.
    @param value: Remove the node with given value.
    @return: The root of the binary search tree after removal.
    """
    ans = []
    def inorder(self, root, value):
        if root is None:
            return

        self.inorder(root.left, value)
        if root.val != value:
            self.ans.append(root.val)
        self.inorder(root.right, value)

    def build(self, left, right):
        if left == right:
            node = TreeNode(self.ans[left])
            return node

        if left > right:
            return None

        mid = (left+right)/2
        node = TreeNode(self.ans[mid])
        node.left = self.build(0, mid-1)
        node.right = self.build(mid+1, right)
        return node

    def removeNode(self, root, value):
        # write your code here
        self.inorder(root, value)
        self.build(0, len(self.ans)-1)
        return self.ans

