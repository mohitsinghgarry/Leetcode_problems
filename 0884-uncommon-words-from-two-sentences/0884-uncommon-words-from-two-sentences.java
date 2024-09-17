class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        //USING EXTRA SPACES    
        Map<String , Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        String[] str1 = s1.trim().split("\\s+");
        String[] str2 = s2.trim().split("\\s+");
        for(int i = 0;i<str1.length;i++) map.put(str1[i] , map.getOrDefault(str1[i],0)+1);
        for(int i = 0;i<str2.length;i++) map.put(str2[i] , map.getOrDefault(str2[i],0)+1);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() <=1) list.add(entry.getKey());
        }
         String[] stringArray = list.toArray(new String[0]);
         return stringArray;
    }
}