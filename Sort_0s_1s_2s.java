//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int arr[], int n)
    {
        // code here 
        int count0=0;
            int count1=0;
            int count2=0;
        for(int i=0;i<arr.length;i++)
        {
            

            if(arr[i]==0){ count0++;}
            else if(arr[i]==1){count1++;}
            else{count2++;}

        }
        for(int i=0;i<count0;i++){arr[i]=0;}
        for(int i=count0;i<count0+count1;i++)
        {
            arr[i]=1;
        }
         for(int i=count0+count1;i<n;i++)
        {
            arr[i]=2;
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends
