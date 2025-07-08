class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1){
            return;
        }
        int k = -1;
        int l = -1;
        for(int i=0;i<nums.length;i++){
            if(i!=nums.length-1 && nums[i]<nums[i+1]){
                k=i;
            }
            if(k!=-1 && k!=i){
                if(nums[k]<nums[i]){
                    l=i;
                }
            }
        }
        if(l==-1 && k==-1){
            Arrays.sort(nums);
        }
        else if(l==-1){
            int temp = nums[k];
            nums[k] = nums[k+1];
            nums[k+1] = temp;
        }
        else{
            int temp = nums[k];
            nums[k] = nums[l];
            nums[l] = temp;
            int sub=1;
            int mid = nums.length-k;
            mid = mid/2;
            for(int i=k+1;i<k+1+mid;i++){
                temp = nums[i]; 
                nums[i] = nums[nums.length-sub];
                nums[nums.length-sub] = temp;
                sub++;
                
            }
        }

    }
}