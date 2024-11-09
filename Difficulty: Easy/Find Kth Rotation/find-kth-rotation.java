//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int findKRotation(List<Integer> arr) {
        int start = 0;
        int end = arr.size() - 1;

        // If the array is already sorted, return 0 (no rotation)
        if (arr.get(start) <= arr.get(end)) {
            return 0;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the smallest element
            if (mid < end && arr.get(mid) > arr.get(mid + 1)) {
                return mid + 1;
            }
            if (mid > start && arr.get(mid) < arr.get(mid - 1)) {
                return mid;
            }

            // Decide which side to search
            if (arr.get(start) <= arr.get(mid)) {
                start = mid + 1; // Move to the right half
            } else {
                end = mid - 1; // Move to the left half
            }
        }

        return 0; // Default case if no rotation found
    }
}
