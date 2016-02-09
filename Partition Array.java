public class Solution {
	/** 
     *@param nums: The integer array you should partition
     *@param k: As description
     *return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
	    //write your code here
	    if (nums == null || nums.length == 0){
	    	return null;
	    }

	    int start = 0, end = nums.length - 1;
	    while (start < end){
	    	if (nums[start] < k && start < end){
	    		start ++;
	    	} else {
	    		int temp = nums[start];
	    		nums[start] = nums[end];
	    		nums[end] = temp;
	    		end++;
	    	}
	    if (nums[end] < k){
	    	return end + 1;
	    }

	    return end;

	    }
    }
}