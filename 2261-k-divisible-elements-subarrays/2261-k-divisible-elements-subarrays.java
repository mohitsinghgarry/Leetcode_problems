import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        Set<String> distinctSubarrays = new HashSet<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < n; j++) {
                if (nums[j] % p == 0) {
                    count++;
                }
                if (count > k) {
                    break;
                }
                sb.append(nums[j]).append(",");
                distinctSubarrays.add(sb.toString());
            }
        }
        
        return distinctSubarrays.size();
    }
}