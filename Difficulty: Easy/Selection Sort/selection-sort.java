//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution {
    // This function returns the index of the smallest element in the unsorted part of the array
    int select(int arr[], int i, int n) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        return minIndex;  // Return index of the smallest element
    }

    // This function sorts the array using Selection Sort algorithm
    void selectionSort(int arr[], int n) {
        // Loop over the array and sort the elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted portion of the array
            int minIndex = select(arr, i, n);

            // Swap the found minimum element with the element at index 'i'
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
