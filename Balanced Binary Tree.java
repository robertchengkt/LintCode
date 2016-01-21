/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
class resultType {
    public boolean isBalanced = true;
    public int maxDepth = 0;
    public resultType(boolean isBalanced, int maxDepth) {
        this.isBalanced = isBalanced;
        this.maxDepth = maxDepth;
    }
}

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        return helper(root).isBalanced;
    }
    
    public resultType helper (TreeNode node){
        if (node == null){
            return new resultType(true, 0);
        }
        
        resultType left = helper(node.left);
        resultType right = helper(node.right);
        
        if (!left.isBalanced || !right.isBalanced){
            return new resultType(false, -1);
        }
        
        if (Math.abs(left.maxDepth - right.maxDepth) > 1){
            return new resultType(false, -1);
        }
        
        return new resultType(true, Math.max(left.maxDepth, right.maxDepth) + 1);
    }
}