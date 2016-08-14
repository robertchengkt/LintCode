class Solution:
    # @param s, a string
    # @return a list of lists of string
    def partition(self, s):
        # write your code here
        res = []
        self.dfs(s, [], res)
        return res

    def dfs(self, s, tmp, res):
    	if len(s) == 0:
    		res.append(tmp)
    	for i in range(1, len(s) + 1):
    		if self.is_palindrome(s[:i]):
    			self.dfs(s[i:], tmp+[s[:i]])

    def is_palindrome(self, str):
    	for i in range(len(str)/2 + 1):
    		if str[i] != str[len(s)-1-j]:
    			return False
    	return True


