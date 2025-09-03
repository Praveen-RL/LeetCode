// Last updated: 9/3/2025, 10:51:12 AM
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return check(root,targetSum,0);
    }
    public boolean check(TreeNode root, int targetSum,int sum){
        if(root==null) return false;
        sum+=root.val;
        if(root.left==null && root.right==null) return sum==targetSum;
        return (check(root.right,targetSum,sum) || check(root.left,targetSum,sum));
    }
}