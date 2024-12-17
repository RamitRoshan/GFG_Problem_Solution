//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        int count = 0;   // To count digits that divide n
        int original = n; // Store the original value of n
        
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            
            // Check if the digit is not 0 and divides the number evenly
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            
            n = n / 10; // Remove the last digit
        }
        
        return count; // Return the total count
    }
}
