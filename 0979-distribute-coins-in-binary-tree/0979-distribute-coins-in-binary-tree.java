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
       private int sum  = 0;
    public int distributeCoins(TreeNode root) {
        if(root == null) return 0;
         distribution(root);
        return sum;
    }
    public void distribution(TreeNode root){
        if(root == null) return;
        distribution(root.left);
        distribution(root.right);

         if(root.left!=null){
            int x = 1-root.left.val;
            root.left.val = root.left.val+x;
            root.val = root.val-x;
            sum+= Math.abs(x);
         } 
         if(root.right!=null){
              int x = 1-root.right.val;
            root.right.val = root.right.val+x;
            root.val = root.val-x;
             sum+= Math.abs(x);
            //  System.out.println(sum);
         }
    }
}