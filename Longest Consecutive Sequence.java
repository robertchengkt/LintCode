public class Solution {
    /**
     * @param nums: A list of integers
     * @return an integer
     */
    public int longestConsecutive(int[] num) {
        // write you code here
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : num){
        	set.add(i);
        }

        int longest = 0;
        for (int i = 0; i< num.length; i++){
        	int current = num[i];
        	int up = current + 1;
        	while (set.contains(up)){
        		set.remove(up);
        		up++;
        	}

        	int down = current - 1;
        	while (set.contains(down)){
        		set.remove(down);
        		down--;
        	}

        	longest = Math.max(longest, (up - down - 1));
        }

        return longest;
    }
}