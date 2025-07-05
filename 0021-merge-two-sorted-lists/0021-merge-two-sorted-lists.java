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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }  
        if(list2==null){
            return list1;
        } 

        ListNode res;

        if(list2.val<list1.val){
            res=new ListNode(list2.val,null);
            list2 = list2.next;
        }  
        else{
            res=new ListNode(list1.val,null);
            list1 = list1.next;
        }  
        ListNode ans = res;

        while(list1!=null && list2!=null){
            if(list2.val<list1.val){
                res.next=new ListNode(list2.val,null);
                list2=list2.next;
            }  
            else{
                res.next=new ListNode(list1.val,null);
                list1=list1.next;
            } 
            res=res.next;
        } 
        while(list1!=null){
            res.next = list1;
            list1 = list1.next;
            res=res.next;
        }
        while(list2!=null){
            res.next=list2;
            list2 = list2.next;
            res=res.next;

        }
        return ans;
    }
}