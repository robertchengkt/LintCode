class Solution:
    # @param candidates, a list of integers
    # @param target, integer
    # @return a list of lists of integers
    def combinationSum(self, candidates, target):
        # write your code here
        res = []
        candidates = list(candidates)
        candidates.sort()
        self.search(candidates, target, 0, [], res)
        return res
    
    def search(self, candidates, target, start, tmp, res):
        length = len(candidates)
        if target == 0:
            if tmp not in res:
                res.append(tmp)
            return
        for i in range(start, length):
            if target < candidates[i]:
                return
            self.search(candidates, target-candidates[i], i, tmp+[candidates[i]], res)