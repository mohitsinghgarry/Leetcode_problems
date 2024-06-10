class Solution {
    public String minWindow(String s, String t) {
        int l = 0 , r = 0 , minlength = Integer.MAX_VALUE, count = 0, index = -1;
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ;i<t.length();i++) map.put(t.charAt(i) , map.getOrDefault(t.charAt(i),0)+1);
        while(r != s.length()){
            char c = s.charAt(r);
            if(map.containsKey(c)) {
                map.put(c , map.get(c) - 1);
                if(map.get(c) >= 0) count++;
            }
            while(count == t.length()){
                if(minlength > r - l + 1){
                    minlength = r - l + 1;
                    index = l;
                }
                char leftChar = s.charAt(l);
                if(map.containsKey(leftChar)){
                    if(map.get(leftChar) >= 0) count--;
                    map.put(leftChar, map.get(leftChar) + 1);
                }
                l++;
            }
            r++;
        }
        return minlength == Integer.MAX_VALUE ? "" : s.substring(index , index + minlength);
    }
}