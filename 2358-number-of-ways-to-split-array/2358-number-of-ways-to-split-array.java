class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] pre_sum = new long[nums.length];
        long total = 0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            pre_sum[i] = total;
        }
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(pre_sum[i]>=(total-pre_sum[i])){
                count++;
            }
        }
        return count;
    }
}