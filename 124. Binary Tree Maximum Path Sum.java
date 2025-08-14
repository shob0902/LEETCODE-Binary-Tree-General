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
    int ms=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return ms;
    }
    private int dfs(TreeNode node){
        if(node==null) return 0;
        int l=Math.max(0,dfs(node.left));
        int r=Math.max(0,dfs(node.right));
        ms=Math.max(ms,node.val+l+r);
        return node.val+Math.max(l,r);
    }
}
