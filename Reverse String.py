class Solution(object):
    def reverseString(self, s):
        """
        :type s: str
        :rtype: str
        """
        if s is None or len(s) == 0:
        	return s

        char_list = list(s)
        
        ptr1, ptr2 = 0, len(s) - 1
        while ptr1 < ptr2:
        	char_list[ptr1], char_list[ptr2] = char_list[ptr2], char_list[ptr1]
        	ptr1 += 1
        	ptr2 -= 1
        s = ''.join(char_list)
        return s