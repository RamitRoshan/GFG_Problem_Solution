class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        
        // handle empty and single-element arrays
        if (arr == null || arr.length <= 1) return true;
        
        return checkSorted(arr, 0); // start from index 0
    }
    
    public boolean checkSorted(int[] array, int index){
        
        //base condition -> if you are at last index
        if(index == array.length-1){
            return true;
        }
        
        return array[index] <= array[index+1] && checkSorted(array, index+1);
    }
}