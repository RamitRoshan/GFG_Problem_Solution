class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        
        int start = 0;
        int end = arr.length-1;
        
        //if element are less than or equal to target
        int ans = arr.length;
        
        
        while(start <= end){
            
            int mid = start + (end-start)/2;
            
            if(arr[mid] > target){
                ans = mid;
                end = mid - 1;
                
            }else{
                start = mid + 1;
            }
        }
        
        return ans;
    }
}
