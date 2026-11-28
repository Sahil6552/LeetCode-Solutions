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
        solve(root);
    }
    public TreeNode solve(TreeNode root){
        if(root==null) return null;
        TreeNode l = solve(root.left);
        TreeNode r = solve(root.right);
         root.left = null;
        root.right = null;
        TreeNode temp = root;
        temp.right = l;
        while(temp.right!=null){
            temp = temp.right;
        }
        temp.right = r;
        return root;
    }
}