class Solution {
    public int minFallingPathSum(int[][] grid) {
        // USING RECURSION
        int[][] dp = new int[grid.length+1][grid.length+1];
        for(int[] arr : dp){
            Arrays.fill(arr , Integer.MAX_VALUE);
        }
     return minFalling(grid ,0 , -1,dp);
    }
    public int minFalling(int[][] grid , int row , int col,int[][] dp ){
        if(row  == grid.length) return 0; 
     int ans =Integer.MAX_VALUE ; 
        if ( col != -1 && dp[row][col] != Integer.MAX_VALUE ) return dp[row][col];
        for(int j = 0;j<grid.length;j++){
            if(col != j){  
            ans = Math.min(ans , minFalling(grid,row +1 , j, dp )+grid[row][j]);
            }   
        }
         return col == -1 ? ans :( dp[row][col] = ans);
    } 
}