//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String str = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.transform(str));
                }
        }
}
// } Driver Code Ends






//User function Template for Java

class Solution {
    public String transform(String s) {
        StringBuilder sb = new StringBuilder("");
        char ch=Character.toUpperCase(s.charAt(0));
        sb.append(ch);

        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == ' ' && i < s.length() - 1) {
                sb.append(curr);
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(curr);
            }
        }
        return sb.toString(); // Move this line inside the method body
    }
}
