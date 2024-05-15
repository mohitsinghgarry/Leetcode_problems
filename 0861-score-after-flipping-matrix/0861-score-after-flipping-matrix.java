class Solution {
    public int matrixScore(int[][] grid) {
        int zero = 0;
        int ones = 0;
        int sum = 0;
          String str = "";
        for(int i = 0;i<grid.length;i++){
         if(grid[i][0] == 0){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 0) grid[i][j] = 1;
                else grid[i][j] = 0;
            }
         }
        }
      for(int j = 0;j<grid[0].length;j++){
             zero = 0; ones = 0;
            for(int i = 0;i<grid.length;i++){
                if(grid[i][j] == 0) zero++;
                else ones++;
            }
            // System.out.print(ones);
            if(zero>ones){
                for(int i = 0;i<grid.length;i++){
                if(grid[i][j] == 0) grid[i][j] = 1;
                else grid[i][j] = 0;
                }
            }
      }
      for(int i = 0;i<grid.length;i++){
         str = "";
        for(int j = 0;j<grid[0].length;j++){
            str+= grid[i][j];
        }
        int number = Integer.parseInt(str, 2);
        sum+= number;
      }
        return sum;
    }
}