class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        
        int start = 0;
        int end = arr.length;
        
        while(start < end){
            
            int mid = start + (end-start)/2;
            
            if(target > arr[mid]){
                start = mid + 1;
                
            }else{
                end = mid;
            }
        }
        
        return start;
    }
}
