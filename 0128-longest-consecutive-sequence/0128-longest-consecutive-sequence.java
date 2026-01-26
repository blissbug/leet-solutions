class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
		if(nums.length==0) {
			return 0;
		}
		for(int i=0;i<nums.length;i++) {
			set.add(nums[i]);
		}
		//added to set for o(1) lookup
		//we only check if its start of a sequence - so we only check if (e-1) does not exist
		int maxLength = 0;
		for(int num: set) {
			if(!set.contains(num-1)) {
				int curr = 1;
				while(set.contains(num+1)) {
					curr++;
					num++;
				}
				maxLength = Math.max(maxLength, curr);
				
			}
		}
		return maxLength;

    }
}