class Solution:
    """
    @param numbers : An array of Integer
    @param target : target = numbers[index1] + numbers[index2]
    @return : [index1 + 1, index2 + 1] (index1 < index2)
    """
    def twoSum(self, numbers, target):
        # write your code here
        result = []
        numbers = sort(numbers)
        if len(number) < 2 or number is None:
        	return result
        ptLeft = 0
        ptRight = len(numbers)
        while ptLeft < ptRight:
        	if numbers[ptLeft] + numbers[ptRight] == target:
        		result.append(numbers[ptLeft], numbers[ptRight])
        		return result
