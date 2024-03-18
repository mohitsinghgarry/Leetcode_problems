class Solution {
    public int findMinArrowShots(int[][] points) {
        // SORT THE ARRAY
        int arrow = 1;
        Arrays.sort(points , (i , j ) -> i[1]-j[1]);
        int i = 0;
        int j = i+1;
        for(i = 0;j<points.length;){
           if((j<points.length)&&(points[i][1] >= points[j][0])&&(points[i][1] <= points[j][1])){
                j++;
           }
           else{
                arrow++;
                i = j;
           }
        }
        return arrow;
    }
}