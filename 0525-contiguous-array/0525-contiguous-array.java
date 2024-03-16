class Solution {
    public int findMaxLength(int[] nums) {
        int[] prefix = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        if(nums.length == 1) return 0;
        int sum = 0;
        int length = 0;
        for(int i = 0;i<nums.length;i++){
           if(nums[i] == 1) sum+=1;
           else sum-=1;
           if(sum == 0) length = i+1;
           else if(map.containsKey(sum)) length = Math.max(length  , i-map.get(sum));
           else map.put(sum , i);
        }
        return length;
    }
}