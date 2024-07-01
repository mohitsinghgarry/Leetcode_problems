class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int i = 0 ;i<arr.length;i++){
            count  = 0;
            for(int j = i;j<arr.length;j++){
                if(arr[j]%2 !=0) count++;
                else count = 0;
                if(count == 3) return true;
            }
        }
        return false;
    }
}