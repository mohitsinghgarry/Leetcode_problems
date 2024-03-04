class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int len = tokens.length;
        int score = 0;
        int i = 0;
        int j = len - 1;
        Arrays.sort(tokens);
        
        while(i <= j){
            if(tokens[i] <= power){
                power -= tokens[i];
                score++;
                i++;
            }else if(score > 0 && i != j){
                power += tokens[j];
                score--;
                j--;
            }else{
                break;
            }
        }
        
        return score;
    }
}