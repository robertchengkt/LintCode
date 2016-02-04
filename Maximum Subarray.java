public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code

        if (nums == null || nums.length == 0){
        	return 0;
        }

        int sum = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++){
        	sum += nums[i];
        	max = Math.max(max, sum);
        	sum = Math.max(0, sum);
        }

        return max;
    }
}