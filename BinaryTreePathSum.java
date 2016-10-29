/**
 * Definition of TreeNode:
 * public class TreeNode {
 * public int val;
 * public TreeNode left, right;
 * public TreeNode(int val) {
 * this.val = val;
 * this.left = this.right = null;
 * }
 * }
 */
public class Solution {
 /**
 * @param root the root of binary tree
 * @param target an integer
 * @return all valid paths
 */
 	public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // Write your code here
        List<List<Integer>> res = new ArrayList<>();
		ArrayList<Integer> path = new ArrayList<Integer>();

 		if (root == null){
 			return res;
 		}
 		path.add(root.val)
 		helper(root, res, path, target, root.val);
 		return res;
    }

    private void helper(TreeNode node, 
    					List<List<Integer>> res, 
    					ArrayList<Integer> path, 
    					int target, 
    					int sum){

    	if (node.left == null && node.right == null){
	    	if (sum == target){
	    		res.add(new ArrayList<Integer>(path));
	    	}
	    	return;
	    }

	    //go left
	    if (node.left != null){
	    	path.add(node.left);
	    	helper(node.left, res, path, target, sum + node.left.val);
	    	path.remove(path.size() - 1);
	    }

	    // go right
	    if (node.right != null){
	    	path.add(node.right);
	    	helper(node.right, res, path, target, sum + node.right.val);
	    	path.remove(path.size() -1);
	    }
    }

}