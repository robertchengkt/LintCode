public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    class Pair {
        public Pair(int s, int i){
            int sum = s;
            int index = i;
        }
    }
    
    public int[] subarraySumClosest(int[] nums) {
        // write your code here
        int[] result = new int[2];
        if (nums == null || nums.length == 0){
            return result;
        } 

        int len = nums.length;
        if (len == 1){
            res.add(0);
            res.add(0);
            return res;
        }

        Pair[] sum = new Pair[len + 1] ;
        int prev = 0;
        sum[0] = new Pair(0,0);
        for (int i = 1; i < len; i++){
            sum[i] = new Pair (prev + sum[i], i)；
            prev = sums[i].sum;
        }

        Arrays.sort(sum, new Comparator(Pair){
            public int compare (Pair a, Pair b){
                return a.sum - b.sum;
            }
        });

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i<=len; i++){
            if (ans > sum[i].sum - sums[i-1].sum){
                ans = sum[i].sum - sums[i-1].sum;
                res.clear();
                int[] temp = new int[] {sum[i].index - 1, sum[i-1].index - 1};
                Arrays.sort(temp);
                res.add(temp[0] + 1);
                res.add(temp[1]);
            }
        }
    return res;
    }
    }
}