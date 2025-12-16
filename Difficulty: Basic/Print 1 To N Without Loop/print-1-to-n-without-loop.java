class Solution {
    public void printNos(int n) {
        // Code here
        
        // base condition
        if(n == 0){
            return;
        }
        
        printNos(n-1);
        System.out.print(n+ " ");
        
    }
 
}
