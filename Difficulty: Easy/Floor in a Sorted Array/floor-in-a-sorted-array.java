// class Solution {
//     public int findFloor(int[] arr, int x) {
//         // code here
        
//         int start = 0;
//         int end = arr.length-1;
        
//         int ans = -1;   // initially maan lo floor nahi mila
        
//         while(start <= end){
            
//             int mid = start + (end-start)/2;
            
            
//             //exact match → floor
//             if(x == arr[mid]){
//                 return mid; 
//             }
            
//             // possible floor
//             if(x >= arr[mid]){
//                 ans =  mid;
//                 start = mid + 1;
                
//             }else{
//                 end = mid -1;
//             }
//         }
//         // agar exact match nahi mila, to last stored floor index return kar
//         return ans;
//     }
// }



class Solution {
    public int findFloor(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;   // -1 if no floor exists

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= x) {
                ans = mid;          // arr[mid] is a possible floor
                start = mid + 1;   // try to find a larger index with value <= x
            } else {
                end = mid - 1;     // value too big, go left
            }
        }
        return ans;
    }
}
