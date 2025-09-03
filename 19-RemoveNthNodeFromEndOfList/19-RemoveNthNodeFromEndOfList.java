// Last updated: 9/3/2025, 10:51:44 AM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode temp1=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int a=count-n;
        if(a==0){
            return head.next;
        }
        for(int i=0;i<a-1;i++){
            temp1=temp1.next;
        }
        temp1.next=temp1.next.next;
        return head;
    }
}