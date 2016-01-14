public class Solution {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        int[] fwdArray = new int[A.size()];
        int[] bwdArray = new int[A.size()];
        ArrayList<Long> result = new ArrayList<Long>();

        fwdArray[0] = 1;
        for (int i = 1; i < A.size(); i++) {
        	fwdArray[i] = fwdArray[i - 1] * nums[i - 1]; 
        }

        bwdArray[A.size() - 1] = 1;
        for (int i = A.size() - 2; i >= 0; i--){
        	bwdArray[i] = bwdArray[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < A.size(); i++) {
        	result.indexOf(i) = fwdArray[i] * bwdArray[i];
        }

        return result;
    }
}