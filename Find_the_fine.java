class Solution {
    
    public long totalFine( long n, long date, long car[], long fine[])
    {
       long sum=0;
        for(int i=0; i<n; i++){
            if(date%2==0 && car[i]%2!=0){
                sum+=fine[i];
            }
            else if(date%2!=0 && car[i]%2==0){
                sum+=fine[i];
            }
        }
        return sum;
    }
