public class Solution {
    /**
     * @param arrays k sorted integer arrays
     * @return a sorted array
     */
	public class Element{
		int row;
		int col;
		int val;
		public Element(int row, int col, int val){
			this.row = row;
			this.col = col;
			this.val = val;
		}
	}

	private Comparator<Element> ElementComparator = new Comparator {
		public int compare(Element left, Element right){
			return left.val - right.val;
		}
	}

    public List<Integer> mergekSortedArrays(int[][] arrays) {
        // Write your code here
    	if (arrays == null || arrays.length == 0){
    		return new int[0];
    	}
    	 int size = 0;
    	 Queue<Element> Q = new PriorityQueue<Element>{
    	 	if (arrays[i].length>0){
    	 		Element elem = new Element(i,0,arrays[i][0]);
    	 		Q.add(elem);
    	 		size += arrays[i].length;
    	 	}
    	 }

    	 int[] result = new int[size];
    	 int index = 0;
    	 while (!Q.isEmpty()){
    	 	Element elem = Q.poll();
    	 	result[index++] = elem.val;
    	 	if (elem.col + 1 < arrays[elem.row].length){
    	 		if (elem.col + 1< arrays[elem.row].length)
    	 	}
    	 }
    }
}