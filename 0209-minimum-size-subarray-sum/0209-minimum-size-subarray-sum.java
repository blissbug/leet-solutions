class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int curr_sum = 0;
        int min_length = Integer.MAX_VALUE;
        int lst = 0;
        for(int i=0;i<nums.length;i++){
            curr_sum+=nums[i];
            while(curr_sum>=target){
                min_length=Math.min(i-lst+1,min_length);
                curr_sum-=nums[lst];
                lst++;
            }
        }
        return min_length==Integer.MAX_VALUE ? 0 : min_length;
    }
}