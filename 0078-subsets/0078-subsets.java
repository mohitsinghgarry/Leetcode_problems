import java.util.ArrayList;
import java.util.List;

class Solution {
    private int length;
    public List<List<Integer>> subsets(int[] nums) {
        //backtracking
        length = nums.length; 
        List<List<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> res   = new ArrayList<>();
        findsubset(nums, 0, lists, res);
        return lists;
    }
    public void findsubset(int[] nums, int i, List<List<Integer>> lists, List<Integer> res){
        if(i == length){
            lists.add(new ArrayList<>(res)); 
            return;
        }
        findsubset(nums , i+1 , lists, res);
        res.add(nums[i]);
        findsubset(nums , i+1 , lists, res);
        res.remove(res.size() - 1); 
    }
}
