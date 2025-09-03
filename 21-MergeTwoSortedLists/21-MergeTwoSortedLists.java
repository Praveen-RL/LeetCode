// Last updated: 9/3/2025, 10:51:43 AM
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
        ListNode dummy=new ListNode();
        ListNode current=dummy;
        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                current.next=list2;
                list2=list2.next;
            }
            else{
                current.next=list1;
                list1=list1.next;
            }
            current=current.next;
        }
        if (list1 != null){
            current.next = list1;
        } 
        else{
            current.next = list2;
        }
        return dummy.next;
    }
}