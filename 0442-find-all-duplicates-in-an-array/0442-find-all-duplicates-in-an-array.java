class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(hash.contains(nums[i])) arr.add(nums[i]);
            else hash.add(nums[i]);
        }
        return arr;
    }
}