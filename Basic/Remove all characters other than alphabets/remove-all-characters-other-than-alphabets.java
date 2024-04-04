//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            String S = br.readLine();
            Solution ob = new Solution();
            System.out.println(ob.removeSpecialCharacter(S));
        }
    }
}

// } Driver Code Ends

//User function Template for Java

// class Solution{
//     String removeSpecialCharacter(String s) {
//         // code here
//         StringBuilder sb = new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             if((ch>='A'&& ch<='Z')||(ch>='a' && ch<='z')){
//                 sb.append(ch);
//             }
//         }
//         String ans = sb.toString();
//         if(ans.isEmpty()){
//             return "-1";
//         }
//         return ans;
//     }
// }



//User function Template for Java

class Solution{
    String removeSpecialCharacter(String s) 
    {
         StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            {
                sb.append(ch);
            }
        }
        if(sb.length()==0)
        {
        	return "-1";
        }
        return sb.toString();// code here
    }
}




// //User function Template for Java

// class Solution{
//     String removeSpecialCharacter(String s) {
//         // code here
//         int l=s.length();
//         String str=s.replaceAll("[^a-zA-Z]","");
//         if(str.length()==0)
//         return "-1";
//         return str;
//     }
// }
