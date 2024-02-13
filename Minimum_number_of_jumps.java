class Solution{
    static int minJumps(int[] arr){
        // your code here
       int n=arr.length;
       if(n<=1){return 0;}
       if(arr[0]==0){return -1;}
       
       int step=arr[0];
       int maxReach=arr[0];
       int jumps=1;
       
       for(int i=1;i<n;i++)
       {
           if(i==n-1){return jumps;}
           maxReach=Integer.max(maxReach,i+arr[i]);
           step--;
           
           if(step==0)
           {
               jumps++;
               if(i>=maxReach) return -1;
               step=maxReach-i;
           }
       }
       
       return -1;
        
    }
}
