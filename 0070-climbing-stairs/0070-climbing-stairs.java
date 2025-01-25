class Solution {
    //MEMOIZATION
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        return climbing(n , dp);
    }
    public int climbing(int n, int[] dp){
        if(n <= 1) return 1;
        if(dp[n] != -1) return dp[n];
        int left = climbing(n -1, dp);
        int right = climbing(n -2, dp);
        return dp[n]  = left + right;
        
    }
}