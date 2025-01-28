class Solution {
    //DEPTH FIRST SEARCH
    public int findMaxFish(int[][] grid) {
        int max = 0;
        //FINDING THE LENGTH
        int m = grid.length;
        int n = grid[0].length;
        int sum = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] != 0) max = Math.max(max ,  finding(grid , m , n , i , j, sum ));
            }
        }
        return max;
    }
    public int finding(int[][] grid , int m , int n , int row , int col , int sum){
        //BASE CONDITIONS
        if(row >= m || col >= n || col < 0 || row<0 || grid[row][col] ==0 ) return 0;
        //DEPTH FIRST SEARCH
        int watercell = grid[row][col];
        grid[row][col] = 0;
       watercell += finding(grid , m , n , row+1 , col , sum);
       watercell += finding(grid , m , n , row , col +1 ,sum);
       watercell+= finding(grid , m , n , row -1 , col , sum);
       watercell += finding(grid , m , n , row , col -1 , sum);
       return watercell;
    }
}