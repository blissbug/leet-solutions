class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        long sum=0;
        long ans=0;
        int j=0;
        //handle case for first k elements
        for(int i=0;i<nums.length;i++){
            if(set.size()>=k){
                set.remove(nums[j]);
                sum-=nums[j];
                j++;
            }
            while(set.contains(nums[i])){
                set.remove(nums[j]);
                sum-=nums[j];
                j++;
            }

            set.add(nums[i]);
            sum+=nums[i];
            if(set.size()==k){
                ans=Math.max(sum,ans);
            }
        }
        return ans;
    }
}