class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        //PREFIX SUM APPROACH
        int[] result = new int[nums.length];
         int n = (int)(Math.pow(2, maximumBit)) -1;
        int xor = 0;
        for(int i = 0;i<nums.length;i++){
            xor = xor ^ nums[i];
            result[nums.length-1-i] = xor ^ n;
        }
        return result;
    }
}