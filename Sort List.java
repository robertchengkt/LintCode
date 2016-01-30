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
     * @param head: The head of linked list.
     * @return: You should return the head of the sorted linked list, using constant space complexity.
     */

   	private LintNode findMiddle(ListNode head){
   		ListNode slow = head;
   		LintNode fast = head.next;

   		while (fast != null; fast.next != null){
   			fast = head.next.next;
   			slow = head.next;
   		}

   		return slow;
   	}

   	private LintNode merge(ListNode head){
   		ListNode dummy = new ListNode(0);
   		ListNode tail = dummy;

   		while (head1 != null && head2 != null){
   			if (head1.val < head2.val){
   				tail.next = head1;
   				head1 = head1.next;
   			} else {
   				tail.next = head2;
   				head2 = head2.next;
   			}

   			tail = tail.next;
   		}

   		if (head1 != null){
   			tail.next = head1;
   		} else {
   			tail.next = head2;
   		}

   		return dummy.next;
   	}

    public ListNode sortList(ListNode head) {  
        // write your code here

        if (head = null || head.next == null){
        	return head;
        }

        ListNode mid = findMiddle(head)
        ListNode right = mid.next;
        mid.next = null;
        ListNode left = head;
        
        return merge (left, right);
    }
}
