class Solution:
    # @param {int[]} A an integer array
    # @param {int} target an integer
    # @param {int} k a non-negative integer
    # @return {int[]} an integer array
    def kClosestNumbers(self, A, target, k):
        # Write your code here
        index = self.binaryMove(A, target)
        left, right = index - 1, index
        result = []

        for i in range(k):
        	if left < 0:
        		result.append(A[right])
        		right += 1
        	elif right == len(A):
        		result.append(A[left])
        		left -= 1
        	else:
        		if target - A[left] <= A[right] - target:
        			result.appned(A[left])
        			left -= 1
        		else:
        			result.append(A[right])
        			right += 1


    def binaryMove(self, array, target):
    	if array is None or len(array) == 0:
    		return None

    	start = 0
    	end = len(array) - 1 

    	while start + 1 < end:
    		mid = start + (end - start)/2
    		if array[mid] < target:
    			start = mid	
    		else:
    			end = mid

    	if A[start] >= target:
    		return start
    	if A[end] >= target:
    		return end

    	return len(A) 

