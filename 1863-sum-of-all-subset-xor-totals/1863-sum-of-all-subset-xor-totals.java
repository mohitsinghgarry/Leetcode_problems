class Solution {
    // private int temp = 0;
    public int subsetXORSum(int[] nums) {
        return subsets(nums,0 ,0);
    }
    public int subsets(int[] nums, int n, int temp ){
        if(n == nums.length) return temp;
       int temp1 = subsets(nums , n+1, temp^nums[n]);
        int z = subsets(nums , n+1, temp);
        return temp1+z;
    }
}