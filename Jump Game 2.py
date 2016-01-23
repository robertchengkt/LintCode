class Solution:
    # @param A, a list of integers
    # @return an integer
    def jump(self, A):
        # write your code here
        minPath = []
        minPath[0] = 0
        length = len(A)
        for range(0, length):
        	