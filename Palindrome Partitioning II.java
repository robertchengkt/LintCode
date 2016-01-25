public class Solution {
    /**
     * @param s a string
     * @return an integer
     */

    public boolean isPalindrome(String s, int start, int end){
    	for (int i = start, j = end; i<j; i++, j--){
    		if (s.charAt(i) != s.charAt(j)){
    			return false;
    		}
    	}
    	return true;
    }

    public boolean[][] getIsPalindrome (String s){
    	boolean[][] palindrome = new boolean[s.length()][s.length()];

    	for (int i = 0; i < s.length() - 1; i++){
    		palindrome[i][i+1] = (s.charAt(i) == s.charAt(i+1));
    	}

    	for (int i =0; i<s.length() ;i++){
    		 palindrome[i][i] = true;
    	}

    	for (int length = 2; length < s.length(); length++){
    		for (int start = 0; start + length < s.length(); start++){
    			palindrome[start][start + length]
    			= palindrome[start+1][start+length-1]&& s.charAt(start) == s.charAt(start+length);
    		}
    	}
    	return palindrome;
    }

    public int minCut(String s) {
        // write your code here
        if (s == null || s.length()== 0){
        	return 0;
        }

        boolean[][] isPalindrome = getIsPalindrome(s);

        int[] f = new int[s.length() + 1];
        for (int i = 0; i<= s.length(); i++){
        	f[i] = i - 1;
        }

        for (int i = 1; i<= s.length(); i++){
        	for (int j = 0; j<i; j++){
        		if (isPalindrome[j][i-1]){
        			f[i] = Math.min(f[i],f[j]+1);
        		}
        	}
        }

        return f[s.length()];
    }
}