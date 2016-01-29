public class Solution {
    /**
     * @param s: A string s
     * @param dict: A dictionary of words dict
     */
    public int getMaxLength (Set<String> dict){
    	int maxLength = 0;
    	for (String word : dict){
    		maxLength = Math.max(maxLength, word.length());
    	}
    	return maxLength;
    }

    public boolean wordBreak(String s, Set<String> dict) {
        // write your code here   
    	if (s == null || s.length() = 0){
    		return true;
    	}

    	int maxLength = getMaxLength(s);
    	boolean[] canSegment = new boolean[s.length() + 1];
    	canSegment[0] = true;
    	for (i = 1; i <= s.length(); i++){
    		
    	}

    }
}