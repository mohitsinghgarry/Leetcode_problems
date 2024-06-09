class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int[] lastseen = new int[]{-1 , -1, -1};
        for(int i = 0;i<s.length();i++){
            lastseen[s.charAt(i)-'a'] = i;
            if(lastseen[0] !=-1 && lastseen[1] !=-1 && lastseen[2] !=-1){
                count = count + (1+Math.min(Math.min(lastseen[0], lastseen[1]),lastseen[2]));
            }
        }
        return count;
    }
}