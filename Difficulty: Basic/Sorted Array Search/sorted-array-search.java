class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        
        if(arr.length == 0) return false;
        
        // int start = 0;
        // int end = arr.length-1;
        
        // while(start <= end){
            
        //     int mid = start + (end-start)/2;
            
        //     if(arr)
        // }
        
        for(int i=0; i<arr.length; i++){
            
            if(arr[i] == k){
                return true;
            }
        }
        return false;
        
        
    }
}