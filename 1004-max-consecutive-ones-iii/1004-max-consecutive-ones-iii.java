class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, max = 0,count = 0,len = 0;
       for(int i = 0;i<nums.length;i++){
        count  = 0;
        for(int j = i ;j<nums.length;j++){
            if(nums[j] == 0) count++;
            if(count<=k) {len = j-i+1; max = Math.max(len , max);}
            else break;
        }
    }
       return max;
    }

}