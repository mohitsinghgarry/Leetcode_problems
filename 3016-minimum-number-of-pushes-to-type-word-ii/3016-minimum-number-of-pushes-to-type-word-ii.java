class Solution {
    public int minimumPushes(String word) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(char ch : word.toCharArray()) map.put(ch , map.getOrDefault(ch,0)+1);
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        HashMap<Character, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : list) {
            temp.put(entry.getKey(), entry.getValue());
        }
        int i = 1,sum = 0,count = 0;
         for (Map.Entry<Character, Integer> entry : temp.entrySet()) {
            sum = sum + (i * entry.getValue());
            count++;
            if(count%8 == 0) i++;
        }

    return sum;
    }
}