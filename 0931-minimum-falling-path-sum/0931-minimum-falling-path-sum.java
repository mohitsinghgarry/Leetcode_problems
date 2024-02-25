class Solution {
    public int minFallingPathSum(int[][] matrix) {
    int res= Integer.MAX_VALUE;
    int m = matrix.length;
    int n = matrix[0].length;
    int row = 0 , col = 0;
    int[][] dp = new int[m+1][n+1];
    for(int[] arr : dp) Arrays.fill(arr , Integer.MAX_VALUE);
     for (int i = 0; i < matrix.length; ++i) {
          res = Math.min(res, minFalling(matrix , m , n, row ,i,dp));
        }
    return res;
    }
    public int minFalling(int[][] mat , int m , int n , int row , int col,int[][] dp){
        if(row == m-1) return dp[row][col] = mat[row][col];
        int k = Integer.MAX_VALUE, temp = Integer.MAX_VALUE;
        if(dp[row][col]!=Integer.MAX_VALUE) return dp[row][col];
        if(col>0) k =minFalling(mat , m , n , row+1 , col-1,dp);
        int l =minFalling(mat , m , n , row+1 , col,dp);
        if(col<n-1) temp = minFalling(mat , m , n , row+1 , col+1,dp);
        return dp[row][col] =Math.min(k,Math.min(l , temp))+mat[row][col];
    }
}