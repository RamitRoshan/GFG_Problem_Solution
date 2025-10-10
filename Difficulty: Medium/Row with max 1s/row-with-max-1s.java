// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n = arr.length;
        int m = arr[0].length;  // number of columns 
        
        int index = -1;
        int maxCount = -1; //-1 never possible so kept in maxcount
        for(int i=0; i<n; i++){
            int countRow = 0;
            
            //traversing entire colm(when i= 0, 1.....)
            for(int j=0; j<m;  j++){
                countRow += arr[i][j];
            }
            
            if(countRow > maxCount){
                maxCount = countRow;
                index = i;
            }
        }
        
        return index;
    }
}