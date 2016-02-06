public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
	class Pair {
		int sum;
		int index; 
		public Pair(int s, int i){
			sum = s;
			index = i;
		}
	}

    public int[] subarraySumClosest(int[] nums) {
        // write your code here
        int[] res = new int[2];
        if (nums == null || nums.length == 0){
        	return res;
        } 

        int len = nums.length;
        if (len == 1){
        	res.add(0);
        	res.add(0);
        	return res;
        }

        Pair[] sums = new Pair[len+1];
        int prev = 0;
        sums[0] =new Pair(0,0);
        for (int i = 1; i < nums.length; i++){
        	sums[i] = new Pair(prev + nums[i], i);
        	prev = prev + nums[i];
        }

        Array.sort(sums, Comparator<Pair>(){
        	public int compare(Pair a, Pair b){
        		return a.sum - b.sum;
        	}
        });

        int ans = Interger.MAX_VALUE;
        for (int i = 0; i <= len; i++){
        	if (ans> sums[i].sum - sums[i-1].sum){
        		ans = sums[i].sum - sums[i-1].sum;
        		res.clear();
        		int[] temp = new int[]{sums[i]}.index - 1, sums[i-1].index - 1};
        		Arrays.sort(temp);
        		res.add(temp[0] + 1);
        		res.add(temp[1]);

        	}
        }
        return res;
    }
}