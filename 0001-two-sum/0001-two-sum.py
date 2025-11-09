class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        for i,v in enumerate(nums):
            if(map.get(v)!=None):
                return [map[v],i]
            else:
                map[target-v]=i

        