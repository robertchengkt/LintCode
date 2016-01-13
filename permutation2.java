class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of unique permutations.
     */
    public ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (nums == null || nums.size() == 0) {
            return result;
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] visited = new int[nums.size()];
        Collections.sort(nums);
        helper(result, list, visited, nums);
        
        return result;
    }
    
    private void helper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int[] visited, ArrayList<Integer> nums) {
        if (list.size() == nums.size()) {
            result.add (new ArrayList<Integer>(list));
        }
        for (int i = 0; i < nums.size(); i++){
            if (visited[i] == 1 || (i != 0 && visited[i-1] == 0 && nums.get(i) == nums.get(i-1))) {
                continue;
            }
            visited[i] = 1;
            list.add(nums.get(i));
            helper(result, list, visited, nums);
            list.remove(list.size()-1);
            visited[i] = 0;
        }
    }
}
