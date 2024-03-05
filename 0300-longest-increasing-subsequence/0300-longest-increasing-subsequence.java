class Solution {
    public int lengthOfLIS(int[] nums) {
        int current  = 0;
        int prev   = -1;
        int[][] dp = new int[nums.length+1][nums.length+1];
        for(int[] num : dp) Arrays.fill(num , -1);
      int temp = length(nums,current  , prev,dp);
      return temp;
    }
    public int length(int[] nums,int current , int prev, int[][]dp){
        if(current==nums.length) return 0;
        if(dp[current][prev+1]!=-1) return dp[current][prev+1];
        int len = length(nums , current+1 , prev,dp);
        if(prev == -1 ||( nums[current]> nums[prev]))
        len =Math.max(len ,  1+length(nums , current+1,current,dp));
        return dp[prev+1][current] = len;
    }
}