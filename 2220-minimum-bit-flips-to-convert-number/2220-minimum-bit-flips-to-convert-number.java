class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        for(int i= 31;i>=0;i--){
            int bit_start = (start >> i) &1;
            int bit_goal = (goal >> i) &1;
            if(bit_start != bit_goal) count++;
        }
        return count;
    }
}