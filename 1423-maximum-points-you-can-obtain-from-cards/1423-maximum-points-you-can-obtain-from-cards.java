class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum = 0 , rightsum = 0, totalsum = 0, max = Integer.MIN_VALUE;
        int length = cardPoints.length-1;
        for(int i = 0;i<k;i++) leftsum +=cardPoints[i];
        max = leftsum;
        for(int i = k-1;i>=0;i--){
            leftsum -= cardPoints[i];
            rightsum +=cardPoints[length--];
            max = Math.max(max , leftsum+rightsum);
        }
        return max;
    }
}