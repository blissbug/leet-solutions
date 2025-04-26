/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count=connected(head,set,false);
        return count;
    }
    public int connected(ListNode node,HashSet<Integer> set,boolean prev){
        if(node==null){
            return 0;
        }
        if(set.contains(node.val)){
            if(!prev){
                return 1+connected(node.next,set,true);
            }
            else{
                return connected(node.next,set,true);
            }
        }
        else{
            return connected(node.next,set,false);
        }
    }
}