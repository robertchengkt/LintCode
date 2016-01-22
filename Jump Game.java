// public class Solution {
//     /**
//      * @param A: A list of integers
//      * @return: The boolean answer
//      */
//     public boolean canJump(int[] A) {
//         // wirte your code here
//         ArrayList<Integer> record = new ArrayList<Integer>();
//         for (int j = 0; j < A.length-1; j++){
//         	record.add(0); 
//         }
//         for (int j = 0; j < A.length-1; j++){
//         	for (int n = 1; n < j; n++){
//         		record.set(j+n, record.get(j+n)+1);
//         	}
//         }

//         return record.get(A.length-1) != 0;
//     }
// }


public class Solution {
    public boolean canJump(int[] A) {
        boolean[] can = new boolean[A.length];
        can[0] = true;
        
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (can[j] && j + A[j] >= i) {
                    can[i] = true;
                    break;
                }
            }
        }
        
        return can[A.length - 1];
    }
}
