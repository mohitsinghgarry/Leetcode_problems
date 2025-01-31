class Solution {
    private int sum = 0;
    public int totalNQueens(int n) {
     char[][] board = new char[n][n];
     for(char[] c : board) Arrays.fill(c , '.');
     solve(board , 0 , n);
     return sum;    
    }
    public void solve(char[][] board  , int col , int n){
        if(col == n) {
            sum++;
            return;
        }
         for(int row = 0 ;row<n ;row++){
            if(checksafeposition(row , col , board,n)){
                board[row][col] = 'Q';
                solve(board ,col+1,n );
                board[row][col] = '.';
            }
        }
    }
    public boolean checksafeposition(int row , int col , char[][] board , int n){
         int duprow = row;
        int dupcol = col;
        while(row >= 0 && col>=0){
            if(board[row][col] == 'Q') return false;
            row -- ; col --;
        }
        row  = duprow;
        col = dupcol;
        while(row <n && col>=0){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        row  = duprow;
        col = dupcol;
        while(col >=0){
            if(board[row][col] == 'Q') return false;
            col--;
        }
        return true;
    }

}