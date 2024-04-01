class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int count = 0;
        int i = str.length()-1;
        while(str.charAt(i)!=' '&& i>0){count++; i--;}
        return (i>0) ? count: count+1;
    }
}