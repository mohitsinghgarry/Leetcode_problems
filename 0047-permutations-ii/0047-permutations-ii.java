class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int[] visited = new int[nums.length];
        solve(res  , new ArrayList<>(), nums, visited);
        return res;
    }
    public void solve(List<List<Integer>> res  , List<Integer> list , int[] nums, int[] visited){
        if(list.size() == nums.length){
            if(!res.contains(list)) res.add(new ArrayList<>(list));
            return;
         }
        //BACKTRACKING
        for(int i = 0;i<nums.length;i++){
            if(visited[i] == 0){
                visited[i] = 1;
                list.add(nums[i]);
                solve(res  , list , nums , visited);
                visited[i] = 0;
                list.remove(list.size()-1);
            }
        }
       
    }
}