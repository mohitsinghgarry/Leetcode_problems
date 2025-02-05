class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        //CREATING HASHMAP FOR STORING THE KEY VALUE PAIR
        int count = 0;
        HashMap<Character , Character> map = new HashMap<>();
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                 map.put(s1.charAt(i) , s2.charAt(i));
                 count++;
            }
        }
         for (Character key : map.keySet()) {
              if(!key.equals(map.get(map.get(key))) || count !=2) return false;
        }
        return true;
        
        
    }
}