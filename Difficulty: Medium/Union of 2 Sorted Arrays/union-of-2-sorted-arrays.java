class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        
        int i=0;
        int j=0;
        
        int n = a.length, m = b.length;
        
        ArrayList<Integer> union = new ArrayList<>();
        
        while(i<n && j<m){
            
            //if both are equal, take the small one and move forward
            if(a[i] == b[j]){
                if(union.isEmpty() || union.get(union.size()-1) != a[i]){
                    union.add(a[i]);
                }
                i++;
                j++;
            }
            //if arr1 is smaller
            else if(a[i] < b[j]){
                if(union.isEmpty() || union.get(union.size()-1) != a[i]){
                    union.add(a[i]);
                }
                i++;
            }
            //if arr2(b) is smaller
            else{
                if(union.isEmpty() || union.get(union.size()-1) != b[j]){
                    union.add(b[j]);
                }
                j++;
            }
        }
        
        while(i<n){
            if(union.isEmpty() || union.get(union.size()-1) != a[i]){
                    union.add(a[i]);
            }
            i++;
        }
        
        while(j<m){
            if(union.isEmpty() || union.get(union.size()-1) != b[j]){
                    union.add(b[j]);
            }
            j++;
        }
        return union;
        
    }
}
