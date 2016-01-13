class Solution:
	def permuation(self,nums):
		if nums is None:
			return []
		nums = sorted(nums)
		permutation = []
		permutations = []
		stack = [-1]
		while len(stack):
			index = stack.pop()
			index += 1
			while index < len(nums):
				if nums[index] not in permutation:
					break
				index += 1

			else:
				if len(permutation):
					permutation.pop()
				continue

			stack.append(index)
			stack.append(-1)
			permutation.append(nums[index])
			if len(permutation) == len(nums):
				permutations.append(list(permutation))
		return permutations


