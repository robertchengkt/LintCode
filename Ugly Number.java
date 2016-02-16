class Solution {
    /**
     * @param k: The number k.
     * @return: The kth prime number as description.
     */
    public long kthPrimeNumber(int k) {
        // write your code here
        Queue<Long> Q = new PriorityQueue<Long>();
        HashSet<Long> check = new HashSet<Long>();

        Long[] core = new Long[3];
        core[0] = Long.valueOf(3);
		core[1] = Long.valueOf(5);
		core[2] = Long.valueOf(7);
		for (int i = 0; i < 3; i++){
			Q.add(core[i]);
			check.add(core[i]);
		}

		Long number = Long.valueOf(0);
		for (int i = 0; i < k; i++){
			number = Q.poll();
			for (int j = 0; j< 3; j++){
				if (!check.contains(core[j]*number)){
					Q.add(number*core[j]);
					check.add(number*core[j]);
				}
			}
		}

		return number;
     }
};

