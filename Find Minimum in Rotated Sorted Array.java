public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        // write your code here
        if (num == null || num.length == 0) {
        	return -1;
        }
        int start = 0, end = num.length - 1;
        int target = num[num.length - 1];

        while (start + 1 < end) {
        	int mid = start + (start - end)/2;
        	if (num[mid] <= target) {
        		end = mid;
        	} else {
        		start = mid;
        	}
        }

        if (num[start] <= target) {
        	return num[start];
        } else {
        	return num[end];
        }

    }
}