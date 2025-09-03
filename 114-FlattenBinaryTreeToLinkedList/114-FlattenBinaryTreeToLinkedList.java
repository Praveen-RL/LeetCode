// Last updated: 9/3/2025, 10:51:11 AM
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
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode RightSubtree=root.right;
        root.right=root.left;
        root.left=null;
        TreeNode current=root;
        while(current.right!=null){
            current=current.right;
        }
        current.right=RightSubtree;
    }
}