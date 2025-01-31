class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++) arr[i] = i+1;
        List<List<Integer>> res = new ArrayList<>();
        solve(res , 0 ,new ArrayList<>(), arr , k);
        return res;
    }
    public void solve(List<List<Integer>> res  , int index , List<Integer> list,int[] arr, int k){
        //BASE CASE
        if(index == arr.length){
            if(list.size() == k) res.add(new ArrayList<>(list));
            return;
        }
        //BACKTRACKING
        list.add(arr[index]);
        solve(res , index +1 , list , arr,k);
        list.remove(list.size()-1);
        solve(res , index +1 , list , arr,k);
    }
}