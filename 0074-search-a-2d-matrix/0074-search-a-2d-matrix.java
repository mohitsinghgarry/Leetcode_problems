class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean n = BinarySearch(matrix,target);
        return n;
    }
      public boolean BinarySearch(int[][] arr, int target){
         int row = 0;
         int column = arr[0].length-1;
         while(row<arr.length && column>=0){
             if(target == arr[row][column]) return true;
             else if(target> arr[row][column])row++;
             else column--;
         }
         return false;
    }
}