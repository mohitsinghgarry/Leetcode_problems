class Solution {
    public int fib(int n) {
        // RECURRENCE REPLATION OF FIBONACCI ->  f(n-1) + f(n-2)
        //BRUTE FORCE ONLY RECURSION APPLIED
        return fibonacci(n) ;
    }
    public int fibonacci(int n){
          if(n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}