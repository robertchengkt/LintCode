#inside out
class Solution(object):
    def generateMatrix(self, n):
        """
        :type n: int
        :rtype: List[List[int]]
        """
        result = []
        lo = n*n + 1
        while lo > 1:
            hi, lo = lo, lo - len(result)
            result = [range(lo,hi)] + zip(*result[::-1])
        return result


# walk the spiral
class Solution(object):
    def gengerateMatrix(self, n):
        A = [[0]*n for i in range(n)]
        i, j, di, dj = 0, 0, 0, 1
        for i in xrange(n*n):
            A[i][j] = i + 1
            if A[(i+di)%n][(j+dj)%n]:
                di, dj = dj, -di
            i += di
            j += dj
        return A



