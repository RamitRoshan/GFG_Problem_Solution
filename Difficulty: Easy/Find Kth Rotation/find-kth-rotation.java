class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        
        int start = 0;
        int end = arr.length-1;

        int min = Integer.MAX_VALUE;
        int index = -1;

        while(start <= end){
            int mid = start + (end-start)/2;

            //eleminate either the left half or right half..
 
           // if left side is sorted
            if(arr[start] <= arr[mid]){
                
                if(arr[start] < min){
                    min = arr[start];
                    index= start;
                }
                //eleminate the left half then move 
                start = mid + 1;

            }
           // if right side is sorted
            else{

                if (arr[mid] < min) {   // ✅ should check arr[mid], not arr[start]]]
                    min = arr[mid];
                    index = mid;
                }
                //eleminate the right.
                end = mid - 1;
            }
        }

        return index;
    }
}