class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
       for(char ch:s.toCharArray()){
           if(ch == '1') count++;
       }
       char[] arr = s.toCharArray();
        char[] result = new char[arr.length];
        Arrays.fill(result, '0');
      if(count == 1) result[arr.length-1] = '1';
      for(int i = 0;i<arr.length;i++){
          if(count==1) result[arr.length-1] = '1';
         if(count>1) result[i] ='1';
          count--;
          if(count == 0) break;
      }

      return new String(result);
    }
  
}