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
    public int maxDepth(TreeNode root) {
        int max = Integer.MIN_VALUE;
        int lmax = 0;
        int rmax = 0;
        if(root==null) return 0;
        lmax = 1+maxDepth(root.left);
        rmax = 1+maxDepth(root.right);
        int ans = Math.max(max,Math.max(lmax,rmax));
        return ans;
    }
}