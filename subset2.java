class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> S) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (S == null | S.size() == 0) {
        	return result;
        }

        Collections.sort(S);
        subsetsHelper(result, list, S, 0);

        return result;
    }
    
    private void subsetsHelper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int[] num, int pos) {

    	result.add(new ArrayList<Integer>(list));
    	
    	for (int i = pos; i < num.length(); i++) {
    		if (i != pos && num.get(i) == num.get(i)){
    			continue;
    		}
    		list.add(num[i]);
    		subsetsHelper(result, list, num, i + 1);
    		list.remove(list.size() - 1);
    	}
    	return result

    }
}