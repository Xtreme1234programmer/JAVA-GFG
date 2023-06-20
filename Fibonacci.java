class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        if(n == 1){
            long[] arr = {1};
            return arr;
        }
        long[] arr = new long[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        
        return arr;
    }
    
   
    
}
