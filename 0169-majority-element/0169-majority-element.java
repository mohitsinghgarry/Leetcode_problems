class Solution {
    public int majorityElement(int[] arr) {
        //USING SORTING
        Arrays.sort(arr);
        int k = arr.length/2;
        return arr[k];
    
    }
}