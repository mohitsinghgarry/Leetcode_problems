class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        //USING RECURSIO+MEMOISATION
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int[] arr:dp) Arrays.fill(arr, -1);
        return common(text1, text2,m , n,dp);
    }
    public int common(String str1 ,String str2, int m , int n, int[][] dp){
        if(m <= 0 || n<=0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(str1.charAt(m-1) == str2.charAt(n-1)) return 1+common(str1 , str2 , m-1 , n-1, dp);
        return dp[m][n] =  Math.max(common(str1 , str2 ,m-1 , n,dp) , common(str1, str2 , m ,n-1,dp));
    }

}