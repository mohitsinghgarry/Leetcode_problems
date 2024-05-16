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
    private int temp = 0;
    public boolean evaluateTree(TreeNode root) {
        if(root == null) return false;
        if(root.val == 1) return true;
        findDfs(root);
        return (temp == 0)? false : true;
    }
    public void findDfs(TreeNode root){
      if(root == null) return;
      if(root.left == null && root.right == null) return;
      findDfs(root.left);
      findDfs(root.right);
       if(root.val == 2) {temp = root.left.val |root.right.val;root.val = temp;}
       if(root.val == 3) {temp = root.left.val & root.right.val;root.val = temp;}
    }
}