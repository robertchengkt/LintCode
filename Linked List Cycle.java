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
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @return: True if it has a cycle, or false
     */
    public boolean hasCycle(ListNode head) {  
        // write your code here
        if (head == null || head.next == null){
        	return false;
        }
        LintNode fast = head.next;
        LintNode slow = head;

        while (fast != slow){
        	if (fast == null || fast.next == null){
        		return false;
        	}

        	fast = head.next.next;
        	slow = head.next;
        }

        return true;
    }
}
