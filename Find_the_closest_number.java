class Solution{
    
    public static int findClosest(int arr[], int n, int target) 
    { 
        // Complete the function
        int min_diff=Integer.MAX_VALUE;
        int min=0;
        for(int i:arr)
        {
            if(Math.abs(target-i)<=min_diff)
            {
                min_diff=Math.abs(target-i);
                min=i;
            }
            
        }
        return min;
    } 
}
