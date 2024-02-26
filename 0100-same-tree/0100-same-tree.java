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
    private int count = 0;
    public boolean isSameTree(TreeNode p, TreeNode q) {
            inorder(p,q);
            if(count >0) return false;
         return true;
    }
    public void inorder(TreeNode p , TreeNode q){
           if(p == null && q!= null) {count++; return ;} 
             if(p!=null && q == null) {count++; return ;} 
         if(p!= null && q!= null){
            inorder(p.left ,q.left);
            if(p.val != q.val) {count++; return ;} 
            inorder(p.right, q.right);
        }
    }
}