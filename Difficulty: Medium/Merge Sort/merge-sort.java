//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    void mergeSort(int arr[], int l, int r) {
        // Base condition: if the array has one or no elements, it's already sorted
        if (l >= r) {
            return;
        }
        
        // Find the middle point
        int m = l + (r - l) / 2;
        
        // Recursively sort the two halves
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        
        // Merge the sorted halves
        merge(arr, l, m, r);
    }
    
    void merge(int arr[], int l, int m, int r) {
        // Sizes of the two subarrays
        int n1 = m - l + 1;
        int n2 = r - m;
        
        // Temporary arrays to hold the data
        int left[] = new int[n1];
        int right[] = new int[n2];
        
        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j];
        }
        
        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        // Copy any remaining elements of the left array
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        
        // Copy any remaining elements of the right array
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
