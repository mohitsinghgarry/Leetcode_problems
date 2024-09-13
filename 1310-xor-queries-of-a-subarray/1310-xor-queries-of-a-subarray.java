class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] res=  new int[queries.length];
        int xor = 0;
        for(int i = 0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            for(int j = start ;j<=end;j++) xor = xor^arr[j];
            res[i] = xor;
            xor = 0;
        }
        return res;
    }
}