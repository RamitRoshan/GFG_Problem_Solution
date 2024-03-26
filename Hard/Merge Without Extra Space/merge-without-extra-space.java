//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    long arr1[] = new long[n];
		    long arr2[] = new long[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Long.parseLong(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Long.parseLong(inputLine[i]);
		    }
		    Solution ob = new Solution();
		    ob.merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    // Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) {
        // Traverse arr1 from end to start and arr2 from start to end.
        int i = n - 1; // Pointer for arr1
        int j = 0;     // Pointer for arr2
        
        // Loop until there are elements in arr1 or arr2
        while (i >= 0 && j < m) {
            // If the current element of arr1 is greater than the first element of arr2
            // Swap them to maintain non-decreasing order
            if (arr1[i] > arr2[j]) {
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--; // Move pointer for arr1 to the left
            j++; // Move pointer for arr2 to the right
        }
        
        // Sort both arrays individually
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
