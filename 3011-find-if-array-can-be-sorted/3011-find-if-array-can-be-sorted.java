class Solution {
    public boolean canSortArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0;i<result.length;i++) result[i] = nums[i];
        for(int j = 0;j<result.length;j++){
        for(int i = 0;i<result.length-1-j;i++){
            if(Integer.bitCount(result[i]) != Integer.bitCount(result[i+1]) && result[i]>result[i+1]) {
               return false;
            }
             int temp = result[i];
                result[i] = result[i+1];
                result[i+1] = temp;
        }
        }
        return true;
    }
}