class Solution {
    public int lengthOfLongestSubstring(String s) {
        //BRUTE FORCE APPROACH
        int max = 0;
       String str ="";
       for(int i = 0;i<s.length();i++){
        if(str.indexOf(s.charAt(i))== -1) str+=s.charAt(i);
        else {
           int index = str.indexOf(s.charAt(i));
              str = str.substring(index + 1) + s.charAt(i);
        }
        max = Math.max(max, str.length());
       }
    return max;
    }
}