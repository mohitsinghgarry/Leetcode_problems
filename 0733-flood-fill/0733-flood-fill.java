class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) { 
        int [][] dp = new int[image.length+1][image[0].length+1];
        for(int[]num:dp)Arrays.fill(num , -1);
        if(color == image[sr][sc]) return image;
        int row = sr;
        int col = sc;
        int one =  image[sr][sc];
        recursive(image , row , col , color,dp, one);
        return image;
    }
    public void recursive(int[][] image  ,int row , int col,int color ,int [][]dp, int one){
       if(row>=image.length || row<0 || col<0|| col>=image[0].length || dp[row][col] == 0 ) return;
        if(row>=0 && row<image.length && col>=0 && col<image[0].length){
        if(image[row][col] == one) image[row][col] = color;
        else return;
         dp[row][col] = 0;
        }
        
    //    System.out.print("1");
       recursive(image , row+1 , col , color, dp,one);
       recursive(image , row-1 , col , color, dp,one);
        recursive(image , row , col+1 , color,dp,one);
        recursive(image , row , col-1 , color,dp,one);
    }
}