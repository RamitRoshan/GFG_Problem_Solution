// User function Template for Java


// class Solution {
//     public int longestSubarray(int[] arr, int k) {
//         int n = arr.length;
//         int len = 0;

//         for (int i = 0; i < n; i++) {
//             int sum = 0; // reset sum for new starting point

//             for (int j = i; j < n; j++) {
//                 sum += arr[j]; // extend subarray

//                 if (sum == k) {
//                     len = Math.max(len, j - i + 1);
//                 }
//             }
//         }

//         return len;
//     }
// }



class Solution {
  
  	// Function to find longest sub-array having sum k
    public int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;
        int prefSum = 0;

        for (int i = 0; i < arr.length; ++i) {
            prefSum += arr[i];

			// Check if the entire prefix sums to k
            if (prefSum == k) 
                res = i + 1;

            // If prefixSum - k exists in the map then there exist such 
      		// subarray from (index of previous prefix + 1) to i.
            else if (mp.containsKey(prefSum - k)) 
                res = Math.max(res, i - mp.get(prefSum - k));

            // Store only first occurrence index of prefSum
            if (!mp.containsKey(prefSum))
                mp.put(prefSum, i);
        }

        return res;
    }
}

// class Solution {
//     public int longestSubarray(int[] arr, int k) {
//         int start = 0, sum = 0, maxLen = 0;

//         for (int end = 0; end < arr.length; end++) {
//             sum += arr[end];

//             while (sum > k && start <= end) {
//                 sum -= arr[start];
//                 start++;
//             }

//             if (sum == k) {
//                 maxLen = Math.max(maxLen, end - start + 1);
//             }
//         }

//         return maxLen;
//     }
// }
