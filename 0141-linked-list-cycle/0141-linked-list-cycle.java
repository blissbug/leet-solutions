/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode slow = head.next;
        ListNode fast=new ListNode();
        if(head.next!=null){
            fast=head.next.next;
        }
        while(fast!=null){
            if(fast==null || fast.next==null){
                return false;
            }
            if(slow==fast){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}