class Solution {
    //BRUTE FORCE ACCORDING TO ME
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res =  new ArrayList<>();
        int visited [] = new int[nums.length];
        Arrays.fill(visited , 0);
        permutation(nums,res , new ArrayList<>(), 0, visited);
        return res;
    }
    public void permutation(int[] nums , List<List<Integer>> res , ArrayList<Integer> list ,int index, int[] visited){
        //BASE CASE
        if(index == nums.length){
           res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0 ;i<nums.length;i++){
            if(visited[i] == 0){
            list.add(nums[i]);
            visited[i] = 1;
            permutation(nums , res , list , index+1,visited);
            list.remove(list.size()-1);
             visited[i] = 0;
            }
        }
    }
}