class Solution {
    public boolean isArraySpecial(int[] nums) {
        //PARITY -> DIFFERENT NUBMERS EVEN /  ODD
        if(nums.length == 1) return true;   
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]%2 == 0 && nums[i] %2 == 0) return false;
            else if(nums[i-1]%2 != 0 && nums[i]%2 != 0) return false;
        }
        return true;
    }
}