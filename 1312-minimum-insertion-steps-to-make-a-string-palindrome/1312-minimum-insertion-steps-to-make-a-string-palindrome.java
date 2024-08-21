class Solution {
    public int minInsertions(String s) {
        // using memoization
        int m = s.length();
        int n = s.length();
        int[][] dp = new int [m+1][n+1];
        for(int [] arr : dp)  Arrays.fill(arr , -1);
        return solve(s , 0 , s.length()-1, dp,m,n);
    }
    public int solve(String s , int i , int j, int[][] dp, int m , int n){
        if(i>=j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i) == s.charAt(j)) return dp[m][n] = solve(s , i+1 , j-1, dp, m , n);
        return dp[m][n] = 1 + Math.min(solve(s , i+1 , j,dp,m,n) , solve(s , i , j-1,dp , m , n));
    }
}