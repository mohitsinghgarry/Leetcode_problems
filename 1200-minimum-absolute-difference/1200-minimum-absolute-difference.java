class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
     int min = Math.abs(arr[1] - arr[0]);  
        for(int i = 0 ;i<arr.length-1;i++){
        ArrayList<Integer> list = new ArrayList<>();
        if(arr[i+1] - arr[i] == min){
            list.add(arr[i]);
            list.add(arr[i+1]);
            res.add(list);
        }
        }
        return res;
    }
}