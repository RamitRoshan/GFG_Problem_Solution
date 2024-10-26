//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        calculateFactorials(n, 1, 1, result);  // Start from 1! = 1
        return result;
    }

    static void calculateFactorials(long n, int i, long factorial, ArrayList<Long> result) {
        // Base case: stop if the factorial exceeds n
        if (factorial > n) {
            return;
        }

        // Add current factorial to the result list
        result.add(factorial);

        // Recursive call to calculate the next factorial
        calculateFactorials(n, i + 1, factorial * (i + 1), result);
    }

    
}