public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        int len = nums.length;
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashMap <Integer, Integer>map = new ArrayList<Integer, Integer>();

        map.put (0,-1);

        int sum = 0;

        for (int i = 0; i<len; i++){
        	sum += nums[i];
            
            if (map.containsKey(sum)){
                res.add(map.get(sum)+1);
                res.add(i);
                return res;
            }

            map.put(sum, i);
        }

        return res;
    }
}