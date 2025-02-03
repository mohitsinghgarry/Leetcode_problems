class Solution {
    public int maxDifference(String s) {
        int max_odd = Integer.MIN_VALUE;
        int min_even = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c,0)+1);
        for(Integer value : map.values()){
            if(value%2 != 0)max_odd = Math.max(max_odd , value);
            else min_even = Math.min(min_even , value);
        }
        return max_odd - min_even;

    }
}