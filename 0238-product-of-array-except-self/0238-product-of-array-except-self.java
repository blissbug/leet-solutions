class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int pre_prod=1;
        int pos_prod=1;
        for(int i=0;i<nums.length;i++){
            pre[i] = pre_prod;
            pre_prod *= nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            post[i]=pos_prod;
            pos_prod *= nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=pre[i]*post[i];
        }
        return ans;
    }
}