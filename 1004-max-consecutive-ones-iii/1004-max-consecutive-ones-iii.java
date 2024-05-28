class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, max = 0,count = 0,len = 0;
        while(r<nums.length){
            if(nums[r] == 0) count++;
            while(count > k ){
                if(nums[l]==0) count--;
                l++;
            }
            if(count<=k){
                len = r-l+1;
                max = Math.max(max ,len);
            }
            r++;
        }
       return max;
    }

}