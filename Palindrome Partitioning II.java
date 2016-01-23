public class Solution {
    /**
     * @param s a string
     * @return an integer
     */
    public boolean isPalindrome (String s, int start, int end){
        for (int i = 0, j = end; i < j; i++, j--){
        	if (s.charAt(i) != s.charAt(j)){
        		return false;
        	}
        }
        return true;
    }

    public boolean[][] getIsPalindrome (String s){
    	boolean[][] isPalindrome = new boolean[s.length()][s.length()];
    	for (int i = 0; i<s.length(); i++){
    		isPalindrome[i][i] = 
    	}
    }
     
    public int minCut(String s) {
        // write your code here

    }
};