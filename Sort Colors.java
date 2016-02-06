class Solution {
    /**
     * @param nums: A list of integer which is 0, 1 or 2 
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        // write your code here
        if (nums == null || nums.length <= 1){
        	return;
        }

        int pl = 0;
        int pr = nums.length - 1;
        int i = 0;

        while (i < nums.length){
        	if (nums[i] == 0){
        		swap(nums, i, pl);
        		pl++;
        		i++;
        	} else if (nums[i] == 1){
        		i++;
        	} else {
        		swap(nums, i, pr);
        		pr--;
        		i++;
        	}
        }
    }

    public void swap(int[] nums, int a, int b){
    	int temp = nums[a];
    	nums[a] = nums[b];
    	nums[b] = temp; 
    }
}