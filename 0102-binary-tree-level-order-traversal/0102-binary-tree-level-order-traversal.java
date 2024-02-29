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
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        int h = height(root);
        for(int i = 1;i<=h;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            traversal(root , i, arr);
            result.add(arr);
        }
        return result;

    }
     public int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        if(left>right) return left+1;
        else return right+1;
    }
    public void traversal(TreeNode root , int i , ArrayList<Integer> arr){
           if (root == null) return;
        if (i == 1){
            arr.add(root.val);
             return;
        }
        else if (i > 1) {
            traversal(root.left, i - 1, arr);
            traversal(root.right, i - 1, arr);
        }
    }
}