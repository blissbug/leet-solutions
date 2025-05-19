class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        long sum=0;
        long ans=0;
        int j=0;
        //handle case for first k elements
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[j]);
                sum-=nums[j];
                j++;
            }
            sum+=nums[i];
            set.add(nums[i]);
            if(i-j+1==k){
                ans=Math.max(ans,sum);
                sum-=nums[j];
                set.remove(nums[j]);
                j++;
            }
        }
        return ans;
    }
}