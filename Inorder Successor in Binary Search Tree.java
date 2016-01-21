/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        // write your code here
        TreeNode sucessor = null;
        if (root == null){
        	return null;
        }

        while (root != null && root.val != p.val){
        	if (root.val > p.val){
        		sucessor = root;
        		root = root.left;
        	} else {
        		root = root.right;
        	}

        	if (root.right == null) {
        		return sucessor;
        	}

        	root = root.right
        	while (root.left != null){
        		root = root.left
        	}

        	return root
        }
    }
}