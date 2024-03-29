//OPTIMISED - 1(SLIDING WINDOW)

class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxElement = Integer.MIN_VALUE;

        for(int i: nums){
            maxElement = Math.max(maxElement, i);
        }
        long ans = 0;
        int wstart = 0;
        long maxWin = 0;
        int wend = 0;

        while(wend < nums.length){
            if (nums[wend] == maxElement) {
                maxWin++;
            }
            while (k == maxWin) {
                if (nums[wstart] == maxElement) {
                    maxWin--;
                }
                wstart++;
            }
            ans += wstart;
            wend++;
        }

        return ans;
    }
}