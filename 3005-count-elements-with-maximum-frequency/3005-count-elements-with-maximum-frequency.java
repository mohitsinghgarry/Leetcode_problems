class Solution {
    public int maxFrequencyElements(int[] nums) {
        //BRUTE FORCE METHOD
        int [] freq = new int[101];
        int result = 0;
        int max  = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++) {freq[nums[i]]++;}
        for(int i =0;i<freq.length;i++) max = Math.max(max , freq[i]);
        for(int i = 0;i<freq.length;i++){
            if(freq[i] == max) result +=max;
        }
        return result;
    }
}