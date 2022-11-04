
//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] input = new String[2];
            input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            Solution ob = new Solution();
            System.out.println(ob.baseEquiv(n, m));
        }
    }
}

// } Driver Code Ends
class Solution {
    String baseEquiv(int n, int m) {
        // code here
        for (int i = 0; i <= 32; i++) {
            // logi (n)=log10 (n)/logn10 (i)
            int num = ((int) (Math.log10(n) / Math.log10(i))) + 1; // to get number of digits we can use log

            if (num == m) {
                return "Yes";
            }
        }
        return "No";
    }
}