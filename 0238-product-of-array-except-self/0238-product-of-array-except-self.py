class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prev = 1
        last = 1
        ans = [1] * len(nums)
        for i, v in enumerate(nums):
            ans[i]*=prev
            ans[len(nums)-i-1]*=last
            
            prev = prev * v
            last = last * nums[len(nums)-i-1]
        return ans

        