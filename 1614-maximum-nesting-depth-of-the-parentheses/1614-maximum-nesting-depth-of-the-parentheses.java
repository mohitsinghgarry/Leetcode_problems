class Solution {
    public int maxDepth(String s) {
        int res = 0;
        int temp = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') temp++;
            else if(ch == ')') temp--;
            res = Math.max(res , temp);
        }
        return res;
    }
}