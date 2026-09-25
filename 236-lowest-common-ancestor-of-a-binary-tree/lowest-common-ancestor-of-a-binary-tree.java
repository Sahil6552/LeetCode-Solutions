/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;
        boolean pisonleft = exists(root.left,p);
        boolean qisonleft = exists(root.left,q);
        if(pisonleft && qisonleft) return lowestCommonAncestor(root.left,  p, q);
        if(!pisonleft && !qisonleft) return lowestCommonAncestor(root.right,  p, q);
        else return root;
    }
    public boolean exists(TreeNode root, TreeNode a){
        if(root==null) return false;
        if(root==a) return true;
        return exists(root.left,a) || exists(root.right,a);
    }
}