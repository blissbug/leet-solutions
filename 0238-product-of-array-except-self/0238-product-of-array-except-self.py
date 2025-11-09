class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pre = [1] * (len(nums))
        post = [1] * (len(nums))
        prev = 1
        last = 1
        ans = []
        for i, v in enumerate(nums):
            pre[i]=prev
            post[len(nums)-i-1]=last
            
            prev = prev * v
            last = last * nums[len(nums)-i-1]
        for i in range(len(nums)):
            ans.insert(i,pre[i]*post[i])
        return ans

        