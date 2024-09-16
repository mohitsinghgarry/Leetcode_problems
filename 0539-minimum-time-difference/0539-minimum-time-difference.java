class Solution {
    public int findMinDifference(List<String> timePoints) {
        // BRUTE FORCE APPROACH
        int size = timePoints.size()-1;
        Collections.sort(timePoints);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<timePoints.size()-1;i++){
        String time2 = timePoints.get(i+1);
        String time1 = timePoints.get(i);
        int time_1 =Integer.parseInt(time1.substring(0,2)) * 60 + Integer.parseInt(time1.substring(3));
        int time_2 =Integer.parseInt(time2.substring(0,2)) * 60 + Integer.parseInt(time2.substring(3));
         int time = time_2 - time_1;
            min = Math.min(time , min);
        }
         int time_1 =Integer.parseInt(timePoints.get(0).substring(0,2)) * 60 + Integer.parseInt(timePoints.get(0).substring(3));
        int time_2 =Integer.parseInt(timePoints.get(size).substring(0,2)) * 60 + Integer.parseInt(timePoints.get(size).substring(3));
        int time_new = 1440 - (time_2 - time_1);
        min = Math.min(time_new , min);
        return min;
    }
}