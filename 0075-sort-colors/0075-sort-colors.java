class Solution {
    public void sortColors(int[] nums) {
        int lo = 0;
		int hi = nums.length-1;
		int i = 0;
		while(i<=hi) {
			if(nums[i]==0) {
				int temp = nums[i];
				nums[i] = nums[lo];
				nums[lo] = temp;
				lo++;
				i++;
			}
			else if(nums[i]==2) {
				int temp = nums[i];
				nums[i] = nums[hi];
				nums[hi] = temp;
				hi--;
			}
			else {
				i++;
			}
		}
    }
}