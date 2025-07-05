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
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean check(TreeNode node,Long lo,Long hi){
        if(node==null){
            return true;
        }
        if(node.val<=lo || node.val>=hi){
            return false;
        }
        if(node.left!=null){
            if(node.left.val>=node.val){
                return false;
            }
        }
        if(node.right!=null){
            if(node.right.val<=node.val){
                return false;
            }
        }
        boolean left = check(node.left,lo,(long)node.val);
        boolean right = check(node.right,(long)node.val,hi);
        return left & right;
    }
}