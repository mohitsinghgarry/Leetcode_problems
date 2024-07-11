class Solution {
    public String reverseParentheses(String s) {
        // USING STACK
        Stack<Integer> stack = new Stack<>();
        String str  ="";

        for(int i  = 0;i<s.length();i++){
            if(s.charAt(i) == '(') stack.push(str.length());
            else if(s.charAt(i) == ')'){
                int index = stack.pop();
           str =   reverse(index ,str.length()-1 , str);

            }
            else str +=(s.charAt(i));
        }
        return str;
    }
    public String reverse(int start , int end , String str){
        char [] ch = str.toCharArray();
       while(start<=end){
            char c = ch[start];
            ch[start] = ch[end];
            ch[end] = c;
            start++;
            end--;
       }
       String sk = new String(ch);
       return sk;
    }
}