class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[m][n];
        int temp3 = n;
        int temp4 = m;
        int temp1=0;
        int temp2=0;
        int i=0,j=0;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++)
            {
                result[i][j]=1;
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(matrix[i][j]==0)
                {
                     temp1 = i;
                     temp2 =j;
                     while(temp3>0)
                     {
                        result[temp1][temp3-1]=0;
                        temp3--;
                    }
                    while(temp4>0){
                       result[temp4-1][temp2]=0;
                       temp4--;
                    }
                    temp4=m;
                    temp3=n;
                }
            }
        }
         for(i=0;i<m;i++){
            for(j=0;j<n;j++){
             if(result[i][j]==1)
             result[i][j]=matrix[i][j];
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
             matrix[i][j]=result[i][j];
            }
        }
  
    }
}