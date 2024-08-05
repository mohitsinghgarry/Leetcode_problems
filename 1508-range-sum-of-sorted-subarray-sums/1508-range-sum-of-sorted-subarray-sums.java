class Solution {
    public int rangeSum(int[] arr, int n, int left, int right) {
        //BRUTE FORCE
        int[] res = new int[n * (n+1) /2];
        int total = 0;
        int l = 0;
         for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                   int sum = 0;
                 for (int k = i; k <= j; k++) {
                    sum+= arr[k];
            }
            res[l] = sum;
            l++;
        }
    }
      l = 0;
        Arrays.sort(res);
        for(int i = left-1;i<right;i++) l=( l + res[i])%(1000000000 +7);
    return l%(1000000000 +7);
    }
}