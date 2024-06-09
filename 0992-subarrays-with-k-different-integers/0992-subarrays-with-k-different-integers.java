class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return function(nums , k) - function(nums , k-1);
    }
    public int function(int[] nums , int k){
            int l =  0 , r  = 0 ,count = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        while(r!=nums.length){
            map.put(nums[r] , map.getOrDefault(nums[r] , 0)+1);
            while(map.size()>k){
                int freq = map.get(nums[l]);
                map.put(nums[l] , freq -1);
                if(map.get(nums[l]) == 0) map.remove(nums[l]);
                l++;
            }
            count += r-l+1;
            r++;
        }
        return count;
    }
}