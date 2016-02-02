/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
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
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @return: a tree node
     */
    private ListNode current;

    public int getLength(ListNode head){
    	int length = 0;
    	while (head != null){
    		length ++;
    		head = head.next;
    	}
    	return length; 
    }

    public TreeNode sortedListToBSTHelper (int size){
    	if (size <= 0){
    		return null;
    	}

    	TreeNode left = sortedListToBSTHelper(size/2);
    	TreeNode root = new TreeNode(current.val);
    	current = current.next;
    	TreeNode right = sortedListToBSTHelper (size - 1 -size/2);

    	root.left = left;
    	root.right = right;

    	return root;

    }

    public TreeNode sortedListToBST(ListNode head) {  
        // write your code here
        int size = getLength(head);
        current = head;
        return sortedListToBSTHelper(size);

    }
}