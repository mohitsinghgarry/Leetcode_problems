class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board  = new char[n][n];
        for(int i = 0;i<n;i++) Arrays.fill(board[i] , '.');
         solve(list , n ,0 , res);
         return res;
    }
    public void solve( char[][] board , int n , int col , List<List<String>> res){
        if(col == n){
            List<String> list = new ArrayList<>();
            for(char[] ch : board) list.add(new String(ch));
            res.add(new ArrayList<>(list));
            return;
        }

        for(int row = 0 ;row<n ;row++){
            if(checksafeposition(row , col , board,n)){
                board[row][col] = 'Q';
                solve(board , n , col+1 , res);
                board[row][col] = '.';
            }
        }
    }
    public boolean checksafeposition(int row , int col , char[][] board, int n ){
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