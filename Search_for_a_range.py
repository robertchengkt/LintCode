class Solution(Object):
    def searchRange(self, nums, target):
        start = self.findFirstTarget(nums, target)
        if start == len(nums) or nums[start] != target:
            return [-1,-1]
        else:
            return [start, findFirstTarget(nums,target+1)-1]

    def findFirstTarget( nums, target):
        i, end = 0, len(nums) - 1
        mid = i + (end - i) / 2
        while i < end:
            if nums[mid] < target:
                i = mid
            else:
                i = end
        return i

