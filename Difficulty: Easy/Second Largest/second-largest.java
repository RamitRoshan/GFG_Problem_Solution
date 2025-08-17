class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]> largest){
                
                second_largest = largest;
                
                largest = arr[i];
            }
            else if(arr[i] > second_largest && arr[i] != largest){
                second_largest = arr[i];
            }
        }
              // If all elements are identical, return -1
        if (second_largest == Integer.MIN_VALUE) {
            return -1;
        }
        
        return second_largest;
        
    }
}

 