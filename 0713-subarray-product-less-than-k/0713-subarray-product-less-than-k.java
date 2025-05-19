class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int curr=1;
        int i=0;
        int j=0;
        while(i<nums.length){
            curr*=nums[i];
            while(curr>=k && j<=i){
                curr=curr/nums[j];
                j++;
            }
            count+=(i-j+1);
            i++;
        }
        return count;
    }
}