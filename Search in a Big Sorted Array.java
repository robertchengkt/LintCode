/**
 * Definition of ArrayReader:
 * 
 * class ArrayReader {
 *      // get the number at index, return -1 if not exists.
 *      public int get(int index);
 * }
 */
public class Solution {
    /**
     * @param reader: An instance of ArrayReader.
     * @param target: An integer
     * @return : An integer which is the index of the target number
     */
    public int searchBigSortedArray(ArrayReader reader, int target) {
        // write your code here
        // Algorithm:
        // 1. find the index of num that is bigger than target (logk)
        // 2. binary search the rest array
        int index = 1;
        while (reader.get(index - 1) < target && reader.get(index - 1) != -1){
        	index = index * 2;
        }

        int start = 0, end = index - 1;

        while (start + 1 < end) {
        	int mid = start + (end - start)/2;

			if (reader.get(mid) < target){
        		start = mid;
        	} else {
        		end = mid;
        	}
        }

        if (reader.get(start) == target){
        	return start;
        }

        if (reader.get(end) == target) {
        	return end;
        }

        return -1;
    }
}