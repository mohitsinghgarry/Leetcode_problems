class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++) sum += nums[i];
        int max = sum;
        int start = 0;
        int end = nums.length-1;
        while(start<end){
             if(nums[start]<nums[end]) {
                sum -= nums[start];
                start++;
                }
             else {
                sum-= nums[end];
                end--;
                }
             max = Math.max(sum , max);
        }
        return max;


    }
}