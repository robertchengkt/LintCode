public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        if (numbers == null || numbers.length < 2){
        	return null;
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>;
        for (int i = 0; i < numbers.length; i++){
        	map.put<numbers[i], i+1>;
        }

        int[] a = new int[2];

        for (int i=0; i< numbers.length; i++){
        	if (map.containsKey(target-numbers[i])){
        		int index1 = i + 1;
        		int index2 = map.get(target-numbers[i]);
        		if (index1 == index2){
        			continue;
        		}

        		a[0] = index1;
        		a[1] = index2;
        		return a;
        	}


        }
        return a;
    }
}