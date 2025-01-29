class Solution {
    private List<List<Integer>> res =  new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        subsetSum(arr  , 0, 0, new ArrayList<>());
        return res;
    }
    public void subsetSum(int[] arr ,int index, int sum, ArrayList<Integer> list){
        //BASE CASE
        if(index == arr.length){
            if(!res.contains(list)){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        
        //RECURSION
        list.add(arr[index]);
        subsetSum(arr , index +1 ,sum + arr[index], list);
        list.remove(list.size()-1);
        subsetSum(arr, index +1 , sum, list);
        
    }
}