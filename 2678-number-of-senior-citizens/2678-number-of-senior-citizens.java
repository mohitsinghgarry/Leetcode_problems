class Solution {
    public int countSeniors(String[] details) {
        // OPTIMSED CODE
        int count = 0;
        for(int i = 0;i<details.length;i++){
            // String str = details[i].substring(11 , 13);
            int num1 =  details[i].charAt(11) -'0';
            int num2 = details[i].charAt(12) - '0';
            int num = num1*10 + num2;
            if(num > 60) count++;
        }
        return count;
    }
}