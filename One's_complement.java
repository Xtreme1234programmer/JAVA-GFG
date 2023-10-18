//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.onesComplement(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int onesComplement(int N){
        //code here
        int ans=0;
        int mul=1;
        int temp=N;
        if(N==0) return 1;
        while(temp>0)
        {
            int rem=temp%2;
            rem=rem^1;
            temp/=2;
            
            ans=ans+mul*rem;
            mul*=2;
            
        }
        return ans;
    }
}
