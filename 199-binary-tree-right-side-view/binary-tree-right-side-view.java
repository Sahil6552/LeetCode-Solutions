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
    public List<Integer> rightSideView(TreeNode root) {
        int lev = level(root);
        int[] arr = new int[lev];
        view(root,0,arr);
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            list.add(arr[i]);
        }
        return list;
    }
    public int level(TreeNode root){
        if(root==null) return 0;
        int leftlevel = level(root.left);
        int rightlevel = level(root.right);
        return 1+Math.max(leftlevel,rightlevel);
    }
    public void view(TreeNode root, int lev, int[] arr){
        if(root==null) return;
        arr[lev] = root.val;
        view(root.left,lev+1,arr);
        view(root.right,lev+1,arr);
    }
}