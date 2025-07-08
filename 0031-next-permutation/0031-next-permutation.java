class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1){
            return;
        }
        int k = -1;
        //start from end to optimize
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                k=i;
                break;
            }
            
        }
        if(k==-1){
            reverse(nums,0,nums.length);
        }
        else{
            for(int i=nums.length-1;i>=k+1;i--){
                if(nums[i]>nums[k]){
                    int temp = nums[k];
                    nums[k] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            reverse(nums,k+1,nums.length);
        }

    }
    public static void reverse(int[] nums,int st,int end){
        int sub=1;
        int mid = end-st;
        mid = mid/2;
        for(int i=st;i<st+mid;i++){
                int temp = nums[i]; 
                nums[i] = nums[nums.length-sub];
                nums[nums.length-sub] = temp;
                sub++;
                
            }
    }
}