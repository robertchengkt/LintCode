class Solution:
    # @param start, a string
    # @param end, a string
    # @param dict, a set of string
    # @return an integer
    def ladderLength(self, start, end, dict):
    	dict.add(end)
    	wordLen = len(start)
    	queue = [start]
    	while queue:
    		cur = queue.popleft()
    		curWord = cur[0]
    		curLen = cur[1]