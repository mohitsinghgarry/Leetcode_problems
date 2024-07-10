class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for(int i = 0;i<logs.length;i++){
            if(logs[i].substring(0 , 2).equals("..") && count>0){ count--;}
            else if(!logs[i].substring(0,2).equals("..") && !logs[i].substring(0,2).equals("./")) count++;
        }
        return (count<0)? 0: count;
    }
}