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
     * @return: You should return the head of the sorted linked list,
     *using constant space complexity.
     */
    public int getLength(ListNode head){
    	if (head == null){
    		return 0;
    	}
    	int count = 0;
    	while (head != null){
    		count ++;
    		head = head.next;
    	}
    	return count;
    }

    public ListNode sortListHelper(ListNode head, int start, int end){
    	if (length == 0 || head == null){
    		return null;
    	}

    	int mid = start + (end -start)/2 ;
    	int left = sortListHelper(head, 0, mid);
    	int right = sortListHelper(head, mid+1, end);

  		return mergeTwoList(left, right);
    }

    public ListNode mergeTwoList(ListNode left, ListNode right){
    	ListNode dummy = ListNode(0);
    	dummy.next = head;
    	ListNode tail = dummy;

    	while (left != null && right != node){
    		if (left.val < right.val){
    			tail.next = left;
    			tail = left;
    			left = left.next;
    		} else {
    			tail.next = right;
    			tail = right;
    			right = right.next;
    		}
    	}

		if (left != null){
			tail.next = left;
			left = left.next;
		} else {
			tail.next = right;
			right = right.next;
		}

    	return dummy.next;
    }

    public ListNode sortList(ListNode head) {  
        // write your code here
        int length = getLength(head);
        return sortListHelper(head, 0, length-1);
    }
}