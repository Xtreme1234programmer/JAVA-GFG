// User function Template for Java
class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        int max=0,min=0,rs=0;
         Arrays.sort(arr);
         rs=arr[n-1]-arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>=k){
            max=Math.max(arr[i-1]+k,arr[n-1]-k);
            min=Math.min(arr[i]-k,arr[0]+k);
            rs=Math.min(rs,max-min);
            }
            else
            {
                continue;
            }
        }
        return rs;
        
    }
}
