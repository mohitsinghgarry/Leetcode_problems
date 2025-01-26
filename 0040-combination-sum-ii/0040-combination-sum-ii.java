class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
         List<List<Integer>> res = new ArrayList<>();
         totalcombination(candidates , res , target ,0 , new ArrayList<>());
         return res;
    }
    static void totalcombination(int[] candidates ,List<List<Integer>> res , int target, int index , List<Integer> list){
         //BASE CASE
         if(target == 0){
            res.add(new ArrayList<>(list));
            return;
         }
        //backtracking
         for(int i = index ;i<candidates.length;i++){
            if(i>index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;

            list.add(candidates[i]);
            totalcombination(candidates , res , target - candidates[i] , i +1 , list);
            list.remove(list.size()-1);
         }
    }
}