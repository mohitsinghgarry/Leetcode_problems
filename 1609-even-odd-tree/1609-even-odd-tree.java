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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return true;
        boolean temp = true;
         queue.offer(root);
          while(!queue.isEmpty()){
            int size = queue.size();
        int previous = temp ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for(int i = 0 ; i < size ; i++){
                TreeNode node = queue.remove();
                if(temp){
                    if(node.val%2==0|| node.val<=previous) return false;
                }
                else{
                    if(node.val%2!=0 || node.val>=previous) return false;
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                previous = node.val;
            }
           temp = !temp;
        }
        return true;
    }

    }