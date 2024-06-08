class Solution {
    public int lengthOfLongestSubstring(String s) {
        // using hasmap
        Map<Character , Integer> map = new HashMap<>();
        int l = 0 , len = s.length(),r = 0,max = 0;
        while(r!=len){
            if(!map.containsKey(s.charAt(r)) || map.get(s.charAt(r)) < l){
                map.put(s.charAt(r), r);
                max = Math.max(max, r-l+1);
            }
            else{
              l = map.get(s.charAt(r))+1;
              map.put(s.charAt(r), r);
            }
            r++;
        }
        return max;
    }
}