class Solution {
    public int rangeSum(int[] arr, int n, int left, int right) {
        //BRUTE FORCE
    int[] prefixSum = new int[n + 1];
    int[] subarraySums = new int[n * (n + 1) / 2];
    int index = 0;

    // Calculate prefix sums
    for (int i = 0; i < n; i++) {
        prefixSum[i + 1] = prefixSum[i] + arr[i];
    }

    // Calculate all subarray sums using prefix sums
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            subarraySums[index++] = prefixSum[j + 1] - prefixSum[i];
        }
    }

    // Sort the subarray sums
    Arrays.sort(subarraySums);

    // Calculate the sum of the specified range
    int result = 0;
    for (int i = left - 1; i < right; i++) {
        result += subarraySums[i];
    }

    return result;
    }
}