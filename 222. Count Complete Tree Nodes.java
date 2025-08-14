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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left=height(root.left),right=height(root.right);
        if(left==right) return (1<<left)+countNodes(root.right);
        else{
            return (1<<right)+countNodes(root.left);
        }
    }
    private int height(TreeNode node){
        int h=0;
        while(node!=null){
            h++;
            node=node.left;
        }
        return h;
    }
}
