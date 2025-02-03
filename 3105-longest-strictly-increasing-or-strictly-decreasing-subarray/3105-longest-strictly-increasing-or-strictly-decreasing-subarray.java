class Solution {
    //ARRAYS APPROACH (BRUTE)
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        int count = 1;
        int i = 0;
        while(i<nums.length-1){
            if(nums[i]<nums[i+1]){
                count++;
                max =Math.max(max ,count);
            }
            else{
                count = 1;
            }
            i++;
        }
        count = 1;
        i = 0;
        while(i<nums.length-1){
            if(nums[i]>nums[i+1]){
                count++;
                max =Math.max(max ,count);
            }
            else{
                count = 1;
            }
            i++;
        }
       
        return max;
    }
}