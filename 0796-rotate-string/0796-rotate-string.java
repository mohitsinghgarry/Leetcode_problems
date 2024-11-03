class Solution {
    public boolean rotateString(String s, String goal) {
        // OPTIMISED SOLUTION
         String str = s+ s;
         if((s.length() == goal.length()) && str.contains(goal)) return true;
         return false;

    }
}