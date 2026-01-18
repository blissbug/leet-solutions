class Solution {
    public int majorityElement(int[] nums) {
        int ct = 0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(i!=0 && nums[i-1]!=nums[i]) {
				ct = 0;
			}
			ct++;
            if(ct>=(nums.length+1)/2) {
				return nums[i];
			}
		}
        return -1;
    }
}