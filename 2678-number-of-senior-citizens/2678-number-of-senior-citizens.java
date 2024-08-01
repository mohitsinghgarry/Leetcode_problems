class Solution {
    public int countSeniors(String[] details) {
        // OPTIMSED CODE
        int count = 0;
        for(int i = 0;i<details.length;i++){
            String str = details[i].substring(11 , 13);
            int num = Integer.parseInt(str);
            // System.out.println(num);
            if(num > 60) count++;
        }
        return count;
    }
}