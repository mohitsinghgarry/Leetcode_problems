class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;
        if(nums.length == 2 && nums[0]<1) return false;
         if( nums.length>2 && nums[nums[0]] ==0 && nums[0]==nums.length) return false;
         return true;
    }
   
}