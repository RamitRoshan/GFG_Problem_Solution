class Solution {
    public int nthRoot(int n, int m) {
        // code here
        
        for(int i=1; i<=m; i++){
            if(Math.pow(i, n) == m){
                return i;
                
            }
            //if value exceed
            else if(Math.pow(i, n) > m){
                break;
            }
        }
        return -1;
    }
}