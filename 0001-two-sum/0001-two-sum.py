class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        lst = []
        for i,v in enumerate(nums):
            if(map.get(v)!=None):
                lst.append(map[v])
                lst.append(i)
                return lst
            else:
                map[target-v]=i

        