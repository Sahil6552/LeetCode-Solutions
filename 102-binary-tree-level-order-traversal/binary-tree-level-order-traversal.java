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
//  class pair{
//     TreeNode node;
//     int level;
//     pair(TreeNode node, int level){
//         this.node = node;
//         this.level = level;
//     }
//  }
 
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new  ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            ArrayList<Integer> list = new ArrayList<>();
            int level = q.size();
            for(int i = 0;i<level;i++){
                TreeNode front = q.poll();
                list.add(front.val);
                if(front.left!=null){
                    q.add(front.left);
                }
                if(front.right!=null){
                    q.add(front.right);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}