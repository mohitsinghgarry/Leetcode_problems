class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //OPTIMISED DYNAMIC PROGRAMMING
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int row = 0 , col = 0;
        int[][] dp = new int[m][n];
        for(int[] arr:dp) Arrays.fill(arr, -1);
        int temp = path(dp ,obstacleGrid , row , col , m ,n);
        return temp;
    }
    public int path(int[][]dp ,int[][] grid  , int row , int col , int m , int n){
        if(row>=m || col>= n) return 0;
        if(grid[row][col] == 1) return 0;
        if(row == m-1 && col == n-1) return 1;
        if(dp[row][col]!=-1) return dp[row][col];
    return dp[row][col]= path(dp ,grid, row+1 , col , m , n)+path(dp ,grid , row , col+1 ,m , n);
    }
}