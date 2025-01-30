class Solution {
    //BRUTE FORCE APPROACH
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res , n, "");
        return res;
    }
    public void generate(List<String> res , int n, String str){
        //BASE CASE
        if(str.length() == 2*n){
            if(!res.contains(str)) {
                if(validate(str)) res.add(str);
            }
            // System.out.println(str);
            return;
        }
        //BACKTRACKING
        str += '(';
        generate(res, n , str);
        str = str.substring(0 , str.length()-1);
        str += ')';
        generate(res , n , str);
    }
    public boolean validate(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '(') stack.push(str.charAt(i));
            else if(str.charAt(i) == ')' && !stack.isEmpty()) stack.pop();
            else if(str.charAt(i) == ')' && stack.isEmpty()) return false;
        }
        return (stack.isEmpty()) ? true : false;
        
    }
}