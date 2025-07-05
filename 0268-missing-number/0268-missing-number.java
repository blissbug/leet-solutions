class Solution {
    public int missingNumber(int[] nums) {
        //xor of number with itself gives 0
        //xor the range and the actual ones, then xor them, you gte the only one not present
        int xorPresent = 0;
        for(int i=0;i<nums.length;i++){
            xorPresent=xorPresent^nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            xorPresent = xorPresent^i;
        }
        return xorPresent;
    }
}