//{ Driver Code Starts
import java.io.*;

import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code Ends

// class Solution{

//     // arr: input array
//     // n: size of array
//     //Function to find the sum of contiguous subarray with maximum sum.
//     long maxSubarraySum(int arr[], int n){
        
//         // Your code here
        
//         long maxSum = Integer.MIN_VALUE;

//         // Iterate through all possible subarrays
//         //outer loop i.e start = 0 i.e index 0
//         for (int start = 0; start < n; start++) {
            
            
//             // This variable will store the sum of the current subarray
//             long currentSum = 0;
//             //inner loop end= start i.e from 1
//             for (int end = start; end < n; end++) {
                
//                 currentSum += arr[end];
                
//                 // Update maxSum if currentSum is greater
//                 if (currentSum > maxSum) {
//                     maxSum = currentSum;
//                 }
//             }
//         }
        
//         return maxSum;   
//     //    Time Complexity (TC): O(n^2) Space Complexity (SC): O(1)
        
//     }
    
// }


// //Optimized Approach
// class Solution{

//     // arr: input array
//     // n: size of array
//     //Function to find the sum of contiguous subarray with maximum sum.
//     long maxSubarraySum(int arr[], int n){
        
//         long sum = 0;
//         long max = Integer.MIN_VALUE;
        
//         for(int i=0; i<n; i++){
            
//             sum = sum+ arr[i];
//             //update Max.
//             max = Math.max(max, sum);
            
//             //if sum is negative 
//             if(sum<0){
//                 sum = 0;
//             }
//         }
//         return max;
//     }
// }

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        long maxsum = Integer.MIN_VALUE;
        long currsum = 0;
        
        for(int i=0; i<n; i++){
            
            currsum = currsum + arr[i];
            if(currsum > maxsum){
                
                maxsum= currsum;
            }
            
            if(currsum < 0){
                currsum = 0;
            }
            
        }
        return maxsum;
    }
}