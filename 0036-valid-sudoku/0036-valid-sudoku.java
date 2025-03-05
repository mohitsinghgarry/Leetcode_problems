class Solution {
    public boolean isValidSudoku(char[][] board) {
        // checking rows for duplicate values
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board[i].length; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    if (sb.toString().contains(ch + ""))
                        return false;
                    else
                        sb.append(ch);
                }
            }
        }
        //checking columns for duplicate values
        for (int j = 0; j < board[0].length; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < board.length; i++) {
                char ch = board[i][j];
                if (ch != '.') {
                    if (sb.toString().contains(ch + ""))
                        return false;
                    else
                        sb.append(ch);
                }
            }
        }
        //checking each 3x3 subgrid for duplicate values
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                StringBuilder sb = new StringBuilder();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        char ch = board[i][j];
                        if (ch != '.') {
                            if (sb.toString().contains(ch + ""))
                                return false;
                            else
                                sb.append(ch);
                        }
                    }
                }
            }
        }
        return true;
    }
}