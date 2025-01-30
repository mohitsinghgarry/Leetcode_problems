class Solution {
    //USING BACKTRACKING
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        subsetfind(nums , res , new ArrayList<>(), 0);
        return res;
    }
    public void subsetfind(int[] nums , List<List<Integer>> res , ArrayList<Integer> list ,int index){
        //BASE CASE
        if(index == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        //BACKTRACKING
        list.add(nums[index]);
        subsetfind(nums , res , list , index+1);
        list.remove(list.size()-1);
        subsetfind(nums , res , list , index+1);
    }
}