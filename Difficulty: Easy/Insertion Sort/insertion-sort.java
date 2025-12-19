class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        
        insertionSortRecursive(arr, arr.length);
        
    }
    
    public void insertionSortRecursive(int[] arr, int n){
        
        //base condition
        if(n <= 1){
            return;
        }
        
        // Sort first n-1 elements
        insertionSortRecursive(arr, n-1);
        
        
        //insert last element at its correct position
        int last = arr[n-1];
        
        int j = n-2;
        
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
        
    }
}



/*
Time complexity: O(n²)

Space complexity: O(n) (due to recursion stack)
*/