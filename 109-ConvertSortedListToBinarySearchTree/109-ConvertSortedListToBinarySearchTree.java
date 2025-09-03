// Last updated: 9/3/2025, 10:51:14 AM
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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);
        
        ListNode mid = findMid(head);
        TreeNode root = new TreeNode(mid.val);
        
        // Recursively build the left and right subtrees
        root.left = sortedListToBST(head); // Left half
        root.right = sortedListToBST(mid.next); // Right half
        
        return root;
    }
    
    private ListNode findMid(ListNode head) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        
        // Move fast pointer two steps and slow pointer one step
        while (fast != null && fast.next != null) {
            prev = slow; // Keep track of the previous node
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Disconnect the left half from the mid node
        if (prev != null) {
            prev.next = null;
        }
        
        return slow; // Return the middle node
    }
}