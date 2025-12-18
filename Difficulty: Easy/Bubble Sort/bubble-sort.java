class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        bubble(arr, arr.length-1, 0);
    }
    
    public void bubble(int[] arr, int row, int col){
        if(row == 0){
            return;
        }
        
        if(col < row){
            if(arr[col] > arr[col+1]){
                
                //swap
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubble(arr, row, col+1);
        }else{
            bubble(arr, row-1, 0);
        }
    }
}