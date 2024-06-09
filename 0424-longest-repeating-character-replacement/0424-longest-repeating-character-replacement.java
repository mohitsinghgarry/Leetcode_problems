class Solution {
    public int characterReplacement(String s, int k) {
        int maxfreq = 0, changes = 0, len = 0;
        for(int i = 0;i<s.length();i++){
            int[] map = new int[26];
            for(int j = i;j<s.length();j++){
                map[s.charAt(j)-'A']++;
                maxfreq = Math.max(maxfreq, map[s.charAt(j)-'A']);
                changes = (j-i+1) - maxfreq;
                if(changes<=k) len = Math.max(len , j-i+1);
                else break;
            }
        }
        return len;
    }
}