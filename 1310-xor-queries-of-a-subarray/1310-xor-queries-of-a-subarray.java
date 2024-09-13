class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        // prefix sum approach
        int[] res=  new int[queries.length];
        int xor = 0;
        for(int i = 0;i<arr.length;i++){
            arr[i] = xor^arr[i];
            xor = arr[i];
        }
       for(int i = 0;i<queries.length;i++){
           int start= queries[i][0];
           int end = queries[i][1];
           if(start == 0) res[i] = arr[end];
           else res[i] = arr[end] ^ arr[start-1];
       }
       return res;
       
    }
}