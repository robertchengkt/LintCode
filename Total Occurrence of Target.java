public class Solution {
    /**
     * @param A an integer array sorted in ascending order
     * @param target an integer
     * @return an integer
     */
    public int totalOccurrence(int[] A, int target) {
        // Write your code here
        int count = 0;
        if (A == null || A.length == 0 || target == null){
            return count;
        }
        
        int start = 0;
        int end = A.length - 1;
        while (start + 1 < end){
            int mid = start + (end - start)/2;
            if (A[mid] == target){
                count++;
            }
            
            if (A[start] > target || A[end] < target){
                return count;
            }
            
            if (A[mid]> target){
                end = mid;
            }
            
            if (A[mid] < target){
                start = mid;
            }
        }
        
        return count;
        
    }
}