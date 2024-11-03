class Solution {
    public boolean rotateString(String s, String goal) {
        //BRUTE FORCE APPROACH
        if(s.length()!=goal.length()) return false;
        String str = s;
        for(int i = 0;i<str.length();i++){
            if(str.equals(goal)) return true;
            str = str.substring(1) + str.charAt(0);
        }
        return false;

    }
}