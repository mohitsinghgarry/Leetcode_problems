class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                if(board[i][j] == word.charAt(0)){
                   if(existing(word , board, i , j,0)) return true;
                }
            }
        }
        return false;
    }
    public boolean existing(String word , char[][] board , int row , int col, int index){
        //BASE CASE
       if (index == word.length()) return true; 
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(index)) {
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '0';
        //DFS
      boolean found = existing(word , board , row  , col+1, index+1)||
        existing(word , board , row +1 , col, index+1)||
        existing(word , board , row -1 , col, index+1)||
        existing(word , board , row , col -1, index+1);
        //BACKTRACK
         board[row][col] = temp;

        return found;
    }
}