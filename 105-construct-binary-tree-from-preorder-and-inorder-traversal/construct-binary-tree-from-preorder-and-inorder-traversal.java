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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        return build(preorder,inorder,0,n-1,0,n-1);
    }
    public static TreeNode build(int[] preorder,  int[]inorder, int pl, int ph, int il, int ih){
        if(il>ih || pl>ph) return null;
        int val = preorder[pl];
        TreeNode root = new TreeNode(val);
        int r = -1;
        for(int i = il;i<=ih;i++){
            if(inorder[i]==preorder[pl]){
                r=i;
                break;
            }
        }
        int count = r-il;
        root.left = build(preorder,inorder,pl+1,pl+count,il,r-1);
        root.right = build(preorder,inorder,pl+count+1,ph,r+1,ih);
        return root;
    }
}