//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        //making three pointer here 
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        //we have to save answer in arraylist
        ArrayList<Integer> result = new ArrayList();
        
        //ye pointer tbtk chalega jbtk ek pointer bahr nai aa jay 
        while(i<n1 && j<n2 && k<n3){
            
            if(A[i]==B[j] && B[j]==C[k]){
                //save answer , koi bhi lelo A[i], B[j] or C[k]
                result.add(A[i]);
                
                int temp = A[i]; //3
                
                i++;j++;k++;
                
                 while((i<n1 && j<n2 && k<n3) && (A[i]==B[j] && B[j]==C[k]) && (C[k] == temp))
                 {
                     i++;j++;k++;
                 }
                
                continue;
            }
            //now tino pointer ek jagah p aa pay so,
            else if(B[j]<C[k]){
                j++;
            }else if(A[i]<C[k]){
                i++;
            } else{
                k++;
            }
            
        }
        
        return result;
    }
    
}
