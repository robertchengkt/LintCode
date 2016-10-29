public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    class ResultType {
    	boolean isBst;
    	int minVal, maxVal;

    	ResultType(boolean isBst, int minVal, int maxVal){
    		this.isBst = isBst;
    		this.minVal = minVal;
    		this.maxVal = maxVal;
    	}
    }

    public boolean isValidBST(TreeNode root) {
        // write your code here
    	ResultType res = helper(root);
    	return res.isBst;
    }

    public ResultType helper(TreeNode node) {
    	if (node == null){
    		return new ResultType(true, Integer.MIN_VALUE, Integer.MAX_VALUE);
    	}

    	ResultType left = helper(node.left);
    	ResultType right = helper(node.right);

    	if (!left.isBst || !right.isBst){
    		return new ResultType(false, 0, 0);
    	}

    	if (node.left != null && left.maxVal >= node.val ||
    		node.right != null && right.minVal <= node.val) {
    		return new ResultType(false, 0, 0);
    	}

    	return new ResultType(true, 
    						  Math.min(node.val, left.minVal),
    						  Math.max(node.val, right.maxVal);
    	}

}
