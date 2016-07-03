class Solution:
    """
    @param L: Given n pieces of wood with length L[i]
    @param k: An integer
    return: The maximum length of the small pieces.
    """
    def woodCut(self, L, k):
        # write your code here
        if sum(L) < k:
            return 0
        
        start = 0
        end = max(L)
        while start + 1 < end:
            mid = (start + end) /2
            pieceSum = sum([lenI / mid for lenI in L])
            if pieceSum < k:
                end = mid
            else:
                start = mid
        
        return start 