//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

// class GFG 
// { 
//     static double medianOfArrays(int n, int m, int a[], int b[]) 
//     {
//         // Your Code Here
//         int[] mergedArray = new int[n + m];
//         int i = n-1;
//         int j = 0;
        
//         while(i>=0 && j<m){
            
            
//             if(a[i]> b[j]){
                
//                 int temp = a[i];
//                 a[i] = b[j];
//                 b[j] = temp;
                
                
//             }
//             i--;
//             j++;
            
//         }
        
//         Arrays.sort(a);
//         Arrays.sort(b);
        
        
//          if (n % 2 == 0) {
            
//             // If number of elements is even
//             return (a[n / 2 - 1] + a[n / 2]) / 2;
            
            
//         } else {
//             // If number of elements is odd
//             return a[n / 2];
//         }
//     }
// }

class GFG {
    static double medianOfArrays(int n, int m, int a[], int b[]) {
        int[] mergedArray = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                mergedArray[k++] = a[i++];
            } else {
                mergedArray[k++] = b[j++];
            }
        }

        while (i < n) {
            mergedArray[k++] = a[i++];
        }

        while (j < m) {
            mergedArray[k++] = b[j++];
        }

        if ((n + m) % 2 == 0) {
            // If number of elements is even
            int mid = (n + m) / 2;
            return (mergedArray[mid - 1] + mergedArray[mid]) / 2.0;
        } else {
            // If number of elements is odd
            return mergedArray[(n + m) / 2];
        }
    }
}