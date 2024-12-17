//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int gcd = 1;
        
        for(int i=1; i<=Math.min(a,b); i++){
            
            if(a%i ==0 && b%i ==0){
                gcd = i;
            }
        }
        int lcm = (a*b)/gcd;
        
        
         // Store LCM and GCD in an array
        int[] result = new int[2];
        result[0] = lcm;
        result[1] = gcd;
        
        return result;
    }
 }

//{ Driver Code Starts.

// } Driver Code Ends