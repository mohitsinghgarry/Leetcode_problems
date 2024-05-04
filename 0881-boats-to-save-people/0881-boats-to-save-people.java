class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        for(int i = 0;i<people.length-1;){
            if(people[i]+people[i+1] <= limit){
                count++;
                i+=2;
            }
            else{
                count++; i++;
            }
            if(i==people.length-1) count++;
        }
        return count++;
    }
}