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
        if(root==null){
            return 0;
        }
        return max(root,0);
    }
    public static int max(TreeNode node,int curr){
        if(node==null){
            return curr;
        }
        int left = max(node.left,1+curr);
        int right = max(node.right,1+curr);
        return Math.max(left,right);
    }
}