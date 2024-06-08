class Solution {
    public int longestOnes(int[] nums, int k) {
        // brute force 
        int zero = 0 , len = 0;
        for(int i = 0;i<nums.length;i++){
            zero = 0;
            for(int j = i;j<nums.length;j++){
                if(nums[j] == 0) zero++;
                if(zero<=k){
                    len = Math.max(len , j-i+1);
                }
                else break;
            }
        }
        return len;
    }
}