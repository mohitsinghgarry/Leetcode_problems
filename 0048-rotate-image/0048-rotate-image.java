class Solution {
    public void rotate(int[][] matrix) {
        int [][] matrix_final = new int[matrix.length][matrix[0].length];
        //FIND THE TILL HOW MANY ITRATION IT WILL RUN --->
        int length = matrix.length/2;
        int len = matrix.length;
        //SWAPING OF ROWS --->
        for(int i =0;i<length;i++){
            for(int j = 0;j<matrix.length;j++){
                int temp;
                temp = matrix[i][j];
                matrix[i][j] = matrix[len-1][j];
                matrix[len-1][j] = temp;
            }
            len--;
        }
        // FINDING THE TRANSPOSE OF THE MATRIX AND STORE IT TO ANOTHER MATRIX --->
       for(int i =0;i<matrix.length;i++){
           for(int j =0;j<matrix[i].length;j++){
               matrix_final[i][j] = matrix[j][i];
           }
       }
       //JUST CHANGE THE ORIGINAL MATRIX 
         for(int i =0;i<matrix.length;i++){
           for(int j =0;j<matrix[i].length;j++){
               matrix[i][j] = matrix_final[i][j];
           }
       }


    }
}