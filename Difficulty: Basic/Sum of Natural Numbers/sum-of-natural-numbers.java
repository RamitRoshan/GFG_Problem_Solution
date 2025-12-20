class Solution {
    public static int findSum(int n) {
        // code here
        
        //base condition
        if(n == 0){
            return n;
        }
        
        return n + findSum(n-1);
    }
}
