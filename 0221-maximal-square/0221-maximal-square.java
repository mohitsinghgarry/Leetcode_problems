class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix. length;
        int n = matrix[0].length;
        int row = 0  , col = 0;
        int[][] mat = new int[matrix.length][matrix[0].length];
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(matrix[i][j] == '1') mat[i][j] =1;
                else mat[i][j] = 0;
            }
        }
        int[][] dp = new int[m+1][n+1];
        for(int i=0 ;i<=n;i++) dp[0][i] = 0;
        for(int j = 0;j<=m;j++) dp[j][0] = 0;
         int temp = maximal(dp , mat, m , n);
         return temp;
    }
    public int maximal(int[][] dp , int[][] mat , int m , int n){
        int max = 0;
        for(int row = 0;row < m;row++){
            for(int col = 0;col<n ;col++){
                if(mat[row][col] == 1){
                dp[row+1][col+1] = Math.min(dp[row][col],Math.min(dp[row][col+1] , dp[row+1][col]))+1;
                max = Math.max(max, dp[row+1][col+1]);
                }
            }
        }
        return max*max;
    }
}