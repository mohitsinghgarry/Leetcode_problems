class Solution {
    public int minimumLength(String s) {
        int i = 0;
        int j = s.length()-1;
        if(s.length() == 1) return 1;
        while(i<=j){
            if(i == j) return 1;
            if(s.charAt(i)!=s.charAt(j)) return j-i+1;
            else{
                char temp =  s.charAt(i);
                while(i<s.length() && j>=0 && (s.charAt(i)==temp || s.charAt(j)==temp)) {
                    if(s.charAt(i) == temp ) i++;
                    if(s.charAt(j) == temp) j--;
                } 
            }
        }

            return  0;
    }
}