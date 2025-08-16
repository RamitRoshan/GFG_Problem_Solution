class Solution {
    public static int largest(int[] arr) {
        // code here
        int maxValue = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxValue){
             maxValue = arr[i];   
            }
        }
        return maxValue;
    }
}
