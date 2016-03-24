class Solution:
    # @param s: a list of char
    # @param offset: an integer 
    # @return: nothing
    def rotateString(self, s, offset):
	    # write you code here
	    if offset == 0:
	        return s
	    
	    chrList = list(s)
	    newList = []
	    i = 0
	    while i < offset:
	        newList.append(chrList.pop())
	        i += 1
	    newList = newList.append(chrList)
	    
	    return "".join(newList)