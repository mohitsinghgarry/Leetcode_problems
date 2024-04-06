class Solution {
    public String minRemoveToMakeValid(String s) {
        int count = 0;
        String str = "";
        String res = "";
        for(char ch : s.toCharArray()){
            if(ch == ')' && count == 0) continue;
            else if(ch == '('){
                count++;
                str +=ch;
            }
            else if(ch == ')'){
                count--;
                str +=ch;
            }
            else str+=ch;
        }
         count = 0;
      for(int i = str.length()-1;i>=0;i--){
         if(str.charAt(i) == '(' && count == 0) continue;
            else if(str.charAt(i)  == '('){
                count++;
                res +=str.charAt(i) ;
            }
            else if(str.charAt(i)  == ')'){
                count--;
                res +=str.charAt(i) ;
            }
            else res+=str.charAt(i) ;
      }
      str="";
      for(int i = res.length()-1 ;i>=0;i--)str+=res.charAt(i);
      return str;
    }
}