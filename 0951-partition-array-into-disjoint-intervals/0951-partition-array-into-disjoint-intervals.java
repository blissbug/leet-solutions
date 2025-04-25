class Solution {
    public int partitionDisjoint(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            left[i]=max;
        }
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(nums[i],min);
            right[i]=min;
        }
        int lo=0;
        int hi=1;
        while(hi<nums.length){
            if(left[lo]<=right[hi]){
                return hi;
            }
            lo++;
            hi++;
        }
        return hi;
    }
}