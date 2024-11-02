class Solution {
    public boolean isCircularSentence(String sentence) {
        int i = 0;
        String[] str = sentence.split(" ");
        for( i = 0;i<str.length-1;i++){
            if(str[i].charAt(str[i].length()-1) != str[i+1].charAt(0)) return false;
        }
        if(str[i].charAt(str[i].length()-1)!= str[0].charAt(0)) return false; 
        return true;
    }
}