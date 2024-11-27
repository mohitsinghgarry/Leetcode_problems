class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        //PREFIX SUM APPROACH
        int[] result = new int[nums.length];
        int[] newresult = new int[nums.length];
        int xor = 0;
        for(int i = 0;i<nums.length;i++){
            result[i] = xor ^ nums[i];
            xor = result[i];
        }
         int n = (int)(Math.pow(2, maximumBit)) -1;
         for(int i = 0;i<nums.length;i++){
            newresult[nums.length-i-1] = result[i] ^n;
         }
        return newresult;
    }
}