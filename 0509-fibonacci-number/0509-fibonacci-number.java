class Solution {
    public int fib(int n) {
        int temp = fibonnaci(n);
        return temp;
    }
    public int fibonnaci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonnaci(n-1)+fibonnaci(n-2);
    }
}