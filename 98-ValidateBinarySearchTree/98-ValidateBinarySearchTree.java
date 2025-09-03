// Last updated: 9/3/2025, 10:51:23 AM
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
    public boolean isValidBST(TreeNode root) {
        return is_BST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean is_BST(TreeNode root,long min,long max){
        if(root == null){
            return true;
        }
        if(root.val<=min || root.val>=max){
            return false;
        }
        return is_BST(root.left,min,root.val) && is_BST(root.right,root.val,max);
    }
}