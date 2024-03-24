class Solution {
    public int findDuplicate(int[] nums) {
        // USING HASHSET(OPTIMISD SOLUTION)
        HashSet<Integer> duplicate = new HashSet<>();
        for(int num:nums){
            if(duplicate.contains(num))
            {
                return num;
            }
            else{
                duplicate.add(num);
            }
        }
        return -1;
    }
}