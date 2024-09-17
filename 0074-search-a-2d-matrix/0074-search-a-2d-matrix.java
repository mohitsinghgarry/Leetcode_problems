class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      // USING BRUTE FORCE APPROACH
      for(int i = 0;i<matrix.length;i++){
         if(target >= matrix[i][0] && target <= matrix[i][matrix[0].length -1]){
            return binarysearch(matrix[i] , target);
         }
      }
      return false;
    }
    public boolean binarysearch(int[] matrix , int target){
        int i = 0, j = matrix.length-1;
            while(i<j){
                int mid =( i+j)/2;
                if(matrix[mid] == target) return true;
                else if(target<matrix[mid]) j = mid-1;
                else i = mid+1;
            }
        return false;
    }
}