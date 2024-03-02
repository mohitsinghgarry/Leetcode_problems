class Solution {
    public int[] sortedSquares(int[] nums) {
        int i =0;
        for(int num:nums){
            nums[i] = num*num;
            i++;
        }
          Arrays.sort(nums);
        return nums;
    }
}