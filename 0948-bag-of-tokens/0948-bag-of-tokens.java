class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int i = 0;
        int j = tokens.length-1;
        int score  = 0;
        Arrays.sort(tokens);
        while(i<=j){
            if(power>=tokens[i]){
              power-=tokens[i];
              i++;
              score++;
            }
            else if(score>0 && i!=j){
                power+=tokens[j];
                j--;
                score--;
            }
            else break;
        }
        return score;
    }

}