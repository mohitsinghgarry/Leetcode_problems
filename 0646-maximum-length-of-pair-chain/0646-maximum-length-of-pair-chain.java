class Solution {
    public int findLongestChain(int[][] pairs) {
        int res= 1;
        Arrays.sort(pairs, (i , j)->i[1]-j[1]);
        for(int i = 1, j = 0;i<pairs.length;i++){
            if(pairs[i][0] > pairs[j][1]) {res++; j = i;}
                      
        }
        return res;
    }
}