// class Solution {
//     int maxLength(int arr[]) {
//         // code here
//         int n = arr.length;
        
//         int maxLen = 0;
        
//         // Loop through each starting point
//         for(int i=0; i<n; i++){
            
//             int sum = 0;
//             // Try all subarrays starting from 'i'
//             for(int j=i; j<n; j++){
//                 sum = sum + arr[j];
                
                
//                 //check if sum == 0
//                 // as the currSum is 0, update the maxLen
//                 if(sum == 0){
//                     maxLen = Math.max(maxLen, j-i+1);
//                 }
//             }
//         }
//         return maxLen;
//     }
// }


class Solution {
    int maxLength(int arr[]) {
        int n = arr.length;
        int maxLen = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLen = i + 1; // subarray from 0..i
            } else if (map.containsKey(sum)) {
                // sum repeated → subarray (map.get(sum)+1 ... i) = 0
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                // store only first occurrence
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}