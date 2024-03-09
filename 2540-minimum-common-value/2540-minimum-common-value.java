class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        //USING TWO POINTER APPROACH
        int i = 0 , j  = 0;
        for( i = 0  , j = 0 ; i<nums1.length;){
            if(j<nums2.length && (nums1[i] < nums2[j])) i++;
            else if(j<nums2.length && nums1[i]>nums2[j]) j++;
            else{
                if(j<nums2.length) return nums1[i];
                else return -1;
            } 
        }
        return -1;
    }
}