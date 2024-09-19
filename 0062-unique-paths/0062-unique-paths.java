class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int[] arr : dp) Arrays.fill(arr , -1);
        return paths(m , n , 0 , 0,dp);
    }
    public int paths(int m , int n , int row , int col,int[][] dp){
        if(row > m || col >n) return 0;
        if(dp[row][col] != -1) return dp[row][col];
        if(row == m-1 && col == n-1) return 1;
       return dp[row][col] =  paths(m , n , row+1 , col,dp) +  paths(m , n , row , col+1,dp);
    }
}