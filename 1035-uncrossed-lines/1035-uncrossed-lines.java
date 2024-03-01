class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m+1][n+1];
        for(int[] i : dp) Arrays.fill(i , -1);
        int temp = lines(nums1, nums2,m , n,dp);
         return temp;
    }
    public int lines(int[] arr1 , int[] arr2 , int m , int n,int[][] dp){
        if(m == 0 || n ==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(arr1[m-1] == arr2[n-1]) return dp[m][n]= 1+ lines(arr1 ,arr2 , m-1 ,n-1,dp);
        return dp[m][n]= Math.max(lines(arr1 , arr2, m-1 , n,dp) , lines(arr1, arr2, m, n-1,dp));
    }
}