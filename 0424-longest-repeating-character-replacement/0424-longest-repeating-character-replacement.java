class Solution {
    public int characterReplacement(String s, int k) {
        int maxfreq = 0, len = 0, r = 0 , l = 0;
        HashMap<Character , Integer> map = new HashMap<>();
        while(r != s.length()){
            map.put(s.charAt(r) , map.getOrDefault(s.charAt(r), 0)+1);
            maxfreq = Math.max(maxfreq ,map.get(s.charAt(r)));
            if((r-l+1) - maxfreq > k){
                int freq =  map.get(s.charAt(l));
                map.put(s.charAt(l), freq-1);
                l++;
            }
            len = Math.max(len , r-l+1);
            r++;
        }
        return len;
    }
}
