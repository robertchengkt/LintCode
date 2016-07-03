class Solution:
    # @param start, a string
    # @param end, a string
    # @param dict, a set of string
    # @return an integer
    def ladderLength(self, start, end, dict):
        # write your code here
	level = 1
	queue = dequeue()
	queue.append([start, level])
	while queue:
	    c = queue.popleft()
            curr_word = c[0]
	    curr_lev = c[1]
	    if self.is_neighbor(end, curr_word):
	    	return curr_lev + 1
	    for word in dict:
	    	if curr != word and self.is_neighbor(curr, curr_word):
			queue.append([curr_word, curr_lev+1])
	return None

   def is_neighbor(self, end, curr_word):
	len1 = len(curr_word)
	len2 = len(end)
	if len1 != len2:
	   return False
