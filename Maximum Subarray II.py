class Solution:
    """
    @param nums: A list of integers
    @return: An integer denotes the sum of max two non-overlapping subarrays
    """
    def maxTwoSubArrays(self, nums):
        # write your code here 
        if not nums:
        	return 0

        size = len(nums)
        # left, right = []
        left, res, sum1 = -sys.maxint, 0, 0 
        left, right = [0 for i in range(size)],[0 for i in range(size)]
        res, sum1, minSum1 = -sys.maxint, 0, 0
        for i in range(size):
        	sum1 += nums[i]
        	res = max(res, sum1 - minSum1)
        	minSum1 = min(minSum1, sum1)
        	left[i] = res

        res, sum2, minSum2 = -sys.maxint, 0, 0
        for i in range(size-1, -1, -1):
        	sum2 += nums[i]
        	res = max(res, sum2 - minSum2)
        	minSum2 = min(minSum2, sum2)
        	right[i] = res

        result = -sys.maxint
        for i in range(size):
        	result = max(result, left[i]+right[i+1])


        return result

