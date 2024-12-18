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
            System.out.println(ob.sumOfSeries(N));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int sumOfSeries(int n) {
        // Base condition
        if (n == 0) {
            return 0; // The sum of cubes up to 0 is 0
        }
        
        // Recursive step
        return (n * n * n) + sumOfSeries(n - 1); // Corrected method name
    }
}
