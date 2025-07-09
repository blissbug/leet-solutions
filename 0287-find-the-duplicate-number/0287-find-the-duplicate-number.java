class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do{
            //no null check as duplicate is confirmed
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(slow!=fast);

        //re initialize slow to start
        slow = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

    }
}