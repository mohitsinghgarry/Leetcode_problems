class Solution {
    //BRUTE FORCE APPROACH ( USING BACKTRACKING + RECURSION )
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = new int[]{1, 2,3,4,5,6,7,8,9};
        int sum = 0;
        List<List<Integer>> res = new ArrayList<>();
        combination(res , arr , k , n , 0 , new ArrayList<>(), sum);
        return res;
    }
    public void combination(List<List<Integer>> res ,int[] arr , int k , int n , int index ,List<Integer> list,int sum){
        //BASE CASE
        if(index == arr.length){
            if(sum == n && list.size() == k){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        //BACKTRACKING
        list.add(arr[index]);
        combination(res , arr , k , n ,index + 1 , list , sum + arr[index]);
        list.remove(list.size()-1);
        combination(res , arr , k , n, index +1 , list , sum);
    }
}