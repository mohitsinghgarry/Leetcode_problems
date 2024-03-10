class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hash = new HashSet<>();
        HashSet<Integer> newhash = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i:nums1) hash.add(i);
        for(int i = 0;i<nums2.length;i++){
            if(hash.contains(nums2[i])){
            if(!newhash.contains(nums2[i])) newhash.add(nums2[i]);
            }
        }
        for(int i:newhash) arr.add(i);
        int[] array = new int[arr.size()];
        for(int i =0;i<array.length;i++) array[i]  = arr.get(i);
        return array;
        //  return arr.stream().mapToInt(i -> i).toArray();
    }
}