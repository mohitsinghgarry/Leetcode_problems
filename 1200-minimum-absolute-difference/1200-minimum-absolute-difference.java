class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
         int min = Integer.MAX_VALUE;
         for(int i = 0;i<arr.length-1;i++) min = Math.min(min , Math.abs(arr[i+1] - arr[i]));
     System.out.print(min);
        for(int i = 0 ;i<arr.length-1;i++){
        ArrayList<Integer> list = new ArrayList<>();
        if( Math.abs(arr[i+1] - arr[i]) == min){
            list.add(arr[i]);
            list.add(arr[i+1]);
            res.add(list);
        }
        }
        return res;
    }
}