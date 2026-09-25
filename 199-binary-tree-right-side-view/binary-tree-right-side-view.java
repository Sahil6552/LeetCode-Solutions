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
        // int[] arr = new int[lev];
        List<Integer> list = new ArrayList<>();
        // for(int i = 0;i<arr.length;i++){
        //     list.add(arr[i]);
        // }
        view(root,0,list);
        return list;
    }
    public int level(TreeNode root){
        if(root==null) return 0;
        int leftlevel = level(root.left);
        int rightlevel = level(root.right);
        return 1+Math.max(leftlevel,rightlevel);
    }
    public void view(TreeNode root, int lev, List<Integer> list){
        if(root==null) return;
        if(list.size()<=lev){
            list.add(root.val);
        }
        else{
            list.set(lev,root.val);
        }
        view(root.left,lev+1,list);
        view(root.right,lev+1,list);
    }
}