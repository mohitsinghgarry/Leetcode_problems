class Solution {
    public int[][] largestLocal(int[][] grid) {
       int[][] maxLocal = new int[grid.length-2][grid[0].length-2];
       for(int i =1;i<grid.length-1;i++){
        for(int j = 1;j<grid.length-1;j++){
            int temp = 0;
            for(int k = i-1;k<=i+1;k++){
                for(int l = j-1;l<=j+1;l++){
                    temp = Math.max(grid[k][l],temp);
                }
            }
            maxLocal[i-1][j-1] = temp;
        }
       }
       return maxLocal;
    }
}