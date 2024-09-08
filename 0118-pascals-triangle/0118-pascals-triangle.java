class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr= new ArrayList<>();
        for(int i = 0;i<numRows;i++){
        List<Integer> list = new ArrayList<>(Collections.nCopies(i+1, 1));
        for(int j = 1;j<i;j++){
                list.set(j ,arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
        }
         arr.add(list);
        }
        return arr;
    }
}