class Solution:
    # @param {int[]} A an integer array
    # @param {int} target an integer
    # @param {int} k a non-negative integer
    # @return {int[]} an integer array
    def kClosestNumbers(self, A, target, k):
        # Write your code here
        if len(A) <= k:
        	return A

        result = []
        ptr = self.binaryMove(A, target)
        ptrL = ptr + 1
        ptrR = ptr - 1
        while len(result) <= k:
        	if abs(A[ptrL] - target) > abs(A[ptrR] - target):
        		result.append(A[ptrR])
        		ptrL -= 1
        	elif abs(A[ptrL] - target) < abs(A[ptrR] - target):
        		result.append(A[ptrL])
        		ptrR += 1

        return result

    def binaryMove(self, array, target):
    	if array is None or len(array) == 0:
    		return None

    	start = 0
    	end = len(array)

    	while start + 1 < end:
    		mid = start + (end - start)/2
    		if array[mid] == target:
    			return mid 
    		elif array[mid] > target:
    			end = mid	
    		else:
    			

