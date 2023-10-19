//{ Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}


// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
          //Your code here
          int n=str.length();
          StringBuilder sb=new StringBuilder();
          for(int i=0;i<n;i++)
          {
              char currChar=str.charAt(i);
              int currFreq=1;
              while(i+1<n && str.charAt(i+1)==currChar)
              {
                  i++;
                  currFreq++;
              }
               sb.append(currChar);
          sb.append(""+currFreq);
          }
         
          return sb.toString();
	}
	
 }
