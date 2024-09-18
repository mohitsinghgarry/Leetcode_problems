class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //USING EXTRA SPACES    
        Map<Integer ,Integer> map = new HashMap<>();
        List<Integer > list = new ArrayList<>();
        for(int num : nums) map.put(num , map.getOrDefault(num , 0)+1);
        for (Integer key : map.keySet()) {
            if(map.get(key) > Math.floor(nums.length/3)) list.add(key);
        }
        return list;

    }
}