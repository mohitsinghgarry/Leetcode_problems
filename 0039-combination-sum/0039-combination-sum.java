class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<Integer>();
         totalcombination(candidates , res , target ,0 , 0, list);
         return res;
    }
    public void totalcombination(int[] candidates ,List<List<Integer>> res , int target, int index , int sum , List<Integer> list){
         //BASE CASE
          if(index  == candidates.length || sum > target){
            return;
          }
          if(sum == target){
            if(!res.contains(list)) res.add(new ArrayList<>(list));
            return ;
          }
        //backtracking
        list.add(candidates[index]);
        sum +=candidates[index];
        totalcombination(candidates , res , target , index , sum, list);
        sum -= candidates[index];
        list.remove(list.size()-1);
        totalcombination(candidates , res , target , index + 1 , sum , list);
    }
}