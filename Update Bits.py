class Solution:
    #@param n, m: Two integer
    #@param i, j: Two bit positions
    #return: An integer
    def updateBits(self, n, m, i, j):
        # write your code here
        mask = (~(1 << (j + 1)) - (1 << i)) if j < 31 else ((1 << i) - 1)
        return (mask & n) + (m << i) 