class Solution {
    int floorSqrt(int n) {
        // code here
        // return (int)Math.sqrt(n);
        
        //using Linear Search
        
        int ans = 1; //(if nothing happens, then at least it'll give 1)
       
        for(int i=1; i<=n; i++){
            
            if(i * i <= n){
                ans = i;
            }else{
                break;
            }
        }
        return ans;
    }
}