public class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        int start = 0, end = A.length - 1;
        
        if (A == null || A.length == 0){
            return 0;
        }

        while (start + 1 < end) {
            
            int mid = start + (end - start)/2;
            
            if (A[mid] == target) {
                return mid;
            } else if (A[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (A[start] >= target) {
            return start;
        } else if (A[end] < target){
            return end + 1;
        } else {
            return end;
        }
            
    }
}
