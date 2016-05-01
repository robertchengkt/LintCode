class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        i, j, di, dj = 0, 0, 0, 1
        result = []
        for i in range(m*n):
        	if result[(i + di) % n][(j + dj) % n]:
        		result.append(matrix[i][j])
        		di, dj = dj, -di
        	else:
        		result.append[i][j]
        	i += di
        	j += dj
        return result
