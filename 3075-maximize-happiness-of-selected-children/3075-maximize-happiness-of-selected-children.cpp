class Solution {
public:
    long long maximumHappinessSum(vector<int>& arr, int k) {
        sort(arr.begin(),arr.end());
        long long  ans=0;
        int loop=0;
        int n=arr.size()-1;
        while(loop<k){
            if(arr[n-loop]-loop>0)
            ans+=arr[n-loop]-loop;
            loop++;
        }
        return ans;
    }
};