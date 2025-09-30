// User function Template for Java
// class Solution {
//     public int findCeil(int[] arr, int x) {
//         // code here
        
//         int start =0;
//         int end = arr.length-1;
//         int result = -1;
        
//         while(start <= end){
            
//             int mid = start + (end-start)/2;
            
//             if(x == arr[mid]){
//                 result = mid;   // store index
//                 end = mid - 1;  // continue searching left for first occurrence
                
//             }else if(x > arr[mid]){
//                 start = mid + 1;
                
//             }else{  //x< arr[mid]
//                 result = mid; // possible ceil, search left side for smaller possible ceil
//                 end = mid -1;
//             }
//         }
        
//         return result;
//     }
// }



class Solution {
    public int findCeil(int[] arr, int x) {
        
        int start = 0;
        int end = arr.length-1;
        
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(arr[mid] >= x){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1; 
            }
        }
        
        return ans;
        
    }
    
}
