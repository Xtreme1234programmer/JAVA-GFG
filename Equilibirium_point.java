class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long sum=0;
        long rightSum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            sum-=arr[i];
            if(sum==rightSum)return i+1;
             rightSum+=arr[i];
        }
        return -1;
    }
}
