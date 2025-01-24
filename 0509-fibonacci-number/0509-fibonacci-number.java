class Solution {
    public int fib(int n) {
        // RECURRENCE REPLATION OF FIBONACCI ->  f(n-1) + f(n-2)
        //OPTIMISED USING DP (MEMOIZATION)
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        return fibonacci(n, dp) ;
    }
    public int fibonacci(int n ,int [] dp){
          if(n <= 1) return n;
          if(dp[n] != -1) return dp[n];
        return dp[n] = fibonacci(n-1 , dp) + fibonacci(n-2, dp);
    }
}