class Solution {
    public int majorityElement(int[] nums) {
        // BRUTE FORCE USING EXTRA SPACES
        Map<Integer , Integer> map  = new HashMap<>();
        for(int i = 0;i<nums.length;i++) map.put(nums[i] , map.getOrDefault(nums[i] , 0) +1);
        for (Integer key : map.keySet()) {
            if(map.get(key) > Math.floor(nums.length/2)) return key;
        }
        return -1;
    }
}