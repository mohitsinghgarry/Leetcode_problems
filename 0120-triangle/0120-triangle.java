class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        //OPTIMISED DYNAMIC PROGRAMMING
        int row = 0 , col = 0;
        int[][] dp = new int[triangle.size()][triangle.size()];
        for(int[] arr : dp) Arrays.fill(arr, -1);
       int temp =  total(triangle,row , col,dp);
       return temp;
    }
    public int total(List<List<Integer>> triangle, int row , int col, int[][] dp){
      if(row >= triangle.size() || col >= triangle.get(row).size()) return 0;
      if(row == triangle.size()-1 && col == triangle.get(row).size()-1) return triangle.get(row).get(col);
      if(dp[row][col]!=-1) return dp[row][col];
      int k = triangle.get(row).get(col)+total(triangle  , row+1 , col,dp);
      int m = triangle.get(row).get(col)+total(triangle , row+1 , col+1,dp);
      return dp[row][col] = Math.min(k , m);
    }
}