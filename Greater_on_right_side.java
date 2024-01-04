class Solution {
   void nextGreatest(int arr[], int n) {
	    // code here
	     int max=arr[n-1];
        arr[n-1]=-1;
        for(int  i=n-2;i>=0;i--){
            int x=arr[i];
            arr[i]=max;
            max=Math.max(x,max);
            
        }
    }
}
