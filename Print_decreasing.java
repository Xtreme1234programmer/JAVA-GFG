class Solution {

    void printNos(int N) {
        // code here
        if(N==1)
        {
            System.out.print(N+" ");
            return;
        }
       
          System.out.print(N+" ");
           printNos(N-1);
        
    }
}
