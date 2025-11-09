class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = prices[0]
        ans = 0
        for i in prices:
            buy = min(buy,i)
            if(buy<i):
                ans = max(i-buy,ans)
        return ans