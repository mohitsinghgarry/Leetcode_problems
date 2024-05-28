class Solution {
    public int maxScore(int[] cardPoints, int k) {
        //BRUTE FORCE APPROACH
        int leftsum = 0 , rightsum = 0 , maxsum = Integer.MIN_VALUE , rightindex = cardPoints.length-1;
        for(int i  = 0;i<k;i++) leftsum +=cardPoints[i];
        for(int i = k-1;i>=0;i--){
            leftsum -=cardPoints[i];
            rightsum +=cardPoints[rightindex];
            maxsum = Math.max(maxsum , leftsum +rightsum);
            rightindex--;
        }
        return maxsum;

    }
}