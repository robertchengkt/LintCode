class Solution:
    """
    @param numbers : An array of Integer
    @param target : target = numbers[index1] + numbers[index2]
    @return : [index1 + 1, index2 + 1] (index1 < index2)
    """
    def twoSum(self, numbers, target):
        # write your code here
        result = []
        tmp = []
        sorted_nums = sorted(numbers)
        if len(numbers) < 2 or numbers is None:
        	return result
        ptLeft = 0
        ptRight = len(sorted_nums) - 1
        while ptLeft < ptRight:
        	if sorted_nums[ptLeft] + sorted_nums[ptRight] == target:
        		tmp.append(sorted_nums[ptLeft + 1])
        		tmp.append(sorted_nums[ptRight + 1])
        		for i in tmp:
        			result.append(numbers.index(i))
        		return result
        	elif numbers[ptLeft] + numbers[ptRight] < target:
        	    ptLeft += 1
        	else:
        	    ptRight -= 1
