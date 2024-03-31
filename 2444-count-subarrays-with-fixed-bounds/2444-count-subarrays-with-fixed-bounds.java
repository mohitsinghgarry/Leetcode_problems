class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int left = -1, right = -1;
        int outofrange = -1;
        long res = 0;
        int temp = 0;
        for(int i = 0;i<nums.length;i++){
            if(!(nums[i]>=minK && nums[i]<=maxK)) outofrange = i;
            if(nums[i] == minK) left = i;
            if(nums[i] == maxK) right = i;
            temp =Math.min(left , right) - outofrange;
            res += (temp >0) ? temp : 0;
        }
        return res;
    }
}