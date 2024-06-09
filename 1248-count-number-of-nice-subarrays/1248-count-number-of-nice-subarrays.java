class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] result = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2 == 0) result[i] = 0;
            else result[i] = 1;
        }

        return function(result , k)-function(result , k-1);
    }
    public int function(int [] nums , int goal){
        int sum = 0 , count = 0, l = 0 , r = 0;
        if(goal < 0) return 0;
        while(r!=nums.length){
            sum+=nums[r];
                while(sum >goal){
                    sum -= nums[l];
                    l++;
                }
            count += r-l+1;
            r++;
        }
        return count;
    }
}