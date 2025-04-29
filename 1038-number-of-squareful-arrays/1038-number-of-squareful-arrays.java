class Solution {
    public int numSquarefulPerms(int[] nums) {
        List<List<Integer>> ll=new ArrayList<>();
		List<Integer> curr=new ArrayList<>();
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int val:nums) {
			if(!map.containsKey(val)) {
				map.put(val, 0);
			}
			map.put(val, map.get(val)+1);
		}
		Arrays.sort(nums);
		combi(nums,ll,curr,-1,map);
		return ll.size();
	}
	public static void combi(int[] nums,List<List<Integer>> ll,List<Integer> curr,int prev,HashMap<Integer,Integer> map) {
		if(curr.size()==nums.length) {
			if(!ll.contains(curr)) {
				ll.add(new ArrayList<>(curr));
			}
			return;
		}
		for(int i=0;i<nums.length;i++) {
            if(i>0 && nums[i-1]==nums[i]) {
				continue;
			}
			if(map.get(nums[i])>0) {
				double val= Math.sqrt(nums[i]+prev);
				if(prev==-1) {
					map.put(nums[i],map.get(nums[i])-1);
					curr.add(nums[i]);
					combi(nums, ll, curr,nums[i],map);
					curr.remove(curr.size()-1);
					map.put(nums[i],map.get(nums[i])+1);

				}
				else if(Math.floor(val)==val) {
					map.put(nums[i],map.get(nums[i])-1);
					curr.add(nums[i]);
					combi(nums, ll, curr,nums[i],map);
					curr.remove(curr.size()-1);
					map.put(nums[i],map.get(nums[i])+1);
				}
				else {
					continue;
				}
			}
		}
		return;
	}
}