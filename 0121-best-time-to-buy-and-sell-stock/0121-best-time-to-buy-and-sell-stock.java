class Solution {
    public int maxProfit(int[] arr) {
        //Better solution
        int min = arr[0];
        int cost = 0;
        int profit = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 1;i<arr.length;i++){
            cost = arr[i] - min;
            profit = Math.max(profit , cost);
            min = Math.min(min , arr[i]);
        }
        return profit;
    }
}