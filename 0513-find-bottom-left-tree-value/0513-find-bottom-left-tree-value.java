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
    private int temp;
    ArrayList<Integer> arr= new ArrayList<>();
    public int findBottomLeftValue(TreeNode root) {
     temp = 0;
    int h = height(root);
    lastlevel(root , h);
      return arr.get(0);
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        if(left>right) return left+1;
        else return right+1;
    }
    public void lastlevel(TreeNode root, int i){
        if (root == null) return;
        if (i == 1){
             temp = root.val;
            arr.add(temp);
             return;
        }
        else if (i > 1) {
            lastlevel(root.left, i - 1);
            lastlevel(root.right, i - 1);
        }
    }
}