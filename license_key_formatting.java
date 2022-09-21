//Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.ReFormatString(s, k));
        }
    }
}
// // User function Template for Java

class Solution{
    static String ReFormatString(String S, int K){
        // code here
             StringBuilder sb = new StringBuilder();
        int count = 0;
        
        for (int i = S.length() - 1; i >= 0; i--) {
            
            if (S.charAt(i) == '-') 
                continue;
                
            if (count == K) {//if one group got completed then add a - symbol and set the count variable again to 0 for forming next group
            
                sb.append('-');
                count = 0;
            }
            sb.append(S.charAt(i));
            count++;
            
        } 
        return sb.reverse().toString().toUpperCase();

    
    }
}