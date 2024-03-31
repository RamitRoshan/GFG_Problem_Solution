//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


// class Solution {
//     String removeDuplicates(String str) {
        
//         int i= 0;
//         int j = str.length()-1;
        
//         while(i< j){
            
//             if(str.charAt(i) == str.charAt(j)){
//                 return str.delete();
//             }
//             i++;
//             j--;
//         }
        
//         return 1;
       
//     }
// }


class Solution {
    String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Check if the character is not already present in the result string
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}


