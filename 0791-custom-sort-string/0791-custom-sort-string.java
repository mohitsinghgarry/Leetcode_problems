class Solution {
    public String customSortString(String order, String s) {
    char[] ch = s.toCharArray();
    char[] ord = order.toCharArray();
    String result = "";
    String str = "";
    HashMap<Character,Integer> map = new HashMap<Character ,Integer>();
    HashSet<Character> set = new HashSet<>();
    for(char c :ch) map.put(c ,map.getOrDefault(c,0)+1);
    for(int i = 0;i<ord.length;i++){
        if (map.containsKey(ord[i])) {
                if(map.get(ord[i])==1) str+=ord[i];
                else if(map.get(ord[i]) >1){
                    int res = map.get(ord[i]);
                    while(res>0){
                        str+=ord[i];
                        res--;
                    }
                }
        }
    }
    for(char i :ord)set.add(i);
    for(char i :ch)if(!set.contains(i)){  result+=i;}
    str+=result;
     return str;
    }
}