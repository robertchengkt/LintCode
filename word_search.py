class Solution:
    # @param board, a list of lists of 1 length string
    # @param word, a string
    # @return a boolean

    def exist(self, board, word):
        # write your code here
        if word is None or len(word) == 0:
        	return True
        row = len(board)
        col = len(board[0])
        visited = [[False for i in range(col)] for j in range(row)]
        if row == 0 or col == 0:
        	return False
        for i in range(row):
        	for j in range(col):
        		if self.dfs(board, word, visited, 0, 0):
        			return True
        return False

    def dfs(self, board, word, visited, row, col):
    	max_row, max_col = len(board), len(board[0])
    	if row >= max_row or row < 0 or col >= max_col or col < 0:
    		return False
    	if word == "":
    		return True
    	if word[0] == board[row][col] and not visited[row][col]:
    		visited[row][col] = True
    		if self.dfs(board, word[1:], visited, row+1, col) or self.dfs(board, word[1:], visited, row-1, col) or\
    		self.dfs(board, word[1:], visited, row, col+1) or self.dfs(board, word[1:], visited, row, col-1):
    			return True
    		else:
    			visited[row][col] = False
    	return False

# class Solution:
#     # @param board, a list of lists of 1 length string
#     # @param word, a string
#     # @return a boolean
#     def exist(self, board, word):
#         # write your code here
#         # Boundary Condition
#         if word == []:
#             return True
#         m = len(board)
#         if m == 0:
#             return False
#         n = len(board[0])
#         if n == 0:
#             return False
#         # Visited Matrix
#         visited = [[False for j in range(n)] for i in range(m)]
#         # DFS
#         for i in range(m):
#             for j in range(n):
#                 if self.exist2(board, word, visited, i, j):
#                     return True
#         return False

#     def exist2(self, board, word, visited, row, col):
#         m, n = len(board), len(board[0])
#         if row < 0 or row >= m or col < 0 or col >= n:
#             return False
#         if word == '':
#             return True
#         if board[row][col] == word[0] and not visited[row][col]:
#             visited[row][col] = True
#             # row - 1, col
#             if self.exist2(board, word[1:], visited, row - 1, col) or self.exist2(board, word[1:], visited, row, col - 1) or self.exist2(board, word[1:], visited, row + 1, col) or self.exist2(board, word[1:], visited, row, col + 1):
#                 return True
#             else:
#                 visited[row][col] = False
#         return False