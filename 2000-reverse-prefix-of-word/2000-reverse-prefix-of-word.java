class Solution {

    //BRUTE FORCE APPROACH
    public String reversePrefix(String word, char ch) {
        String str = "";
        int index = word.indexOf(ch);
         for(int i = index;i>=0;i--) str+= word.charAt(i);
         for(int i = index+1;i<word.length();i++) str+=word.charAt(i);
        return str;
    }
}