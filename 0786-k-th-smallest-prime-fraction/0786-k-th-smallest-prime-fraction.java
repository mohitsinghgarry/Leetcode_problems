class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        // USING TWO POINTER
        int[] result = new int[2];
        int index = 0;
        ArrayList<String> res= new ArrayList<String>();
         ArrayList<Double> res1= new ArrayList<Double>();
        HashMap<Double , String > map = new HashMap<>();
        for(int i = arr.length-1;i>=0;i--){
            for(int j = 0;j<arr.length;j++){
                if(j!=i && j<i){ 
                    res.add(arr[j]+"/"+arr[i]); 
                    double num = (double)arr[j]/(double)arr[i];
                    res1.add(num);
                    }
            }
        }
        for(int i = 0;i<res1.size();i++) map.put(res1.get(i), res.get(i));
        Collections.sort(res1);
       String str = map.get(res1.get(k-1));
       for(int i = 0;i<str.length();i++){
         if(str.charAt(i)=='/'){
            index = i; 
            break;
         }
       }
       result[0] = Integer.valueOf(str.substring(0,index));
       result[1] = Integer.valueOf(str.substring(index+1, str.length()));
return result;

    }
}