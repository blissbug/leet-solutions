class Solution {
    public int majorityElement(int[] nums) {
        int ct = 0;
		int ele = -1;
		for(int num: nums) {
			if(ct==0) {
				ele = num; //assign the number as the result ad count 0
			}
			if(ele!=num) {
				//case when a diff element is present
				ct--;
			}
			else {
				//same element so increase the frequency
				ct++;
			}
		}
        return ele;
    }
}