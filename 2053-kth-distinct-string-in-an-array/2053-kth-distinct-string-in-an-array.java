class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String , Integer> map = new LinkedHashMap<>();
        String res = "";
        for(int i = 0;i<arr.length;i++) map.put(arr[i] , map.getOrDefault(arr[i], 0)+1);
         for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.print(entry.getKey());
                k--;
                if(k == 0){
                     res = entry.getKey();
                     break;
                }
            }
        }
        return res;
    }
}