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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int a = level(root.left)+level(root.right);
        int leftlevel = diameterOfBinaryTree(root.left);
        int rightlevel = diameterOfBinaryTree(root.right);
        return Math.max(a,Math.max(leftlevel,rightlevel));
    }
    public int level(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
}