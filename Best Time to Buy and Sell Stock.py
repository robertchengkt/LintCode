class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if prices is None or len(prices) == 0:
            return None
        
        min = prices[0]
        max = prices[0]
        profit = 0

        for i in prices:
            if i < min:
                min = i
            elif i - min > profit:
                profit = i - min
        return profit

        