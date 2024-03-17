//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            
            String ans = ob.triDownwards(S);
            
            for(int i=0 ; i<ans.length() ; i++)
            {
                System.out.print(ans.charAt(i));
                if((i+1)%S.length()==0)
                    System.out.println();
            }
        }
    }
}
// } Driver Code Ends




//User function Template for Java

// class Solution {
//     static String triDownwards(String S) {
//         StringBuilder sb = new StringBuilder();

//         for (int i = 0; i < S.length(); i++) {
//             // Add dots to the left side
//             sb.append(".".repeat(i));

//             // Append the remaining characters in the string
//             sb.append(S.substring(i)).append("\n");

//             // Move to the next line
//           // sb.append("\n");
//         }

//         return sb.toString();
//     }
// }

class Solution {
    static String triDownwards(String S){

        String str = "";
        for(int i=0; i<S.length(); i++){
            for(int j=0; j<S.length(); j++){
                if(j<i){
                    str = str+".";
                }
                else{
                    str = str + S.charAt(j);
                }
            }
        }
   return str;
   }
};

