class Solution
{
    public String is_palindrome(int x)
    {
        // Code here
        if(x==0)
        {
            return "Yes";
        }
        int temp=x;
        int rv=0;
        while(temp>0)
        {
            int rem_digit=temp%10;
             rv=(rv*10)+rem_digit;
             temp/=10;

             if(x==rv)
             {
                 return "Yes" ;
             }
        }
        return "No";
    
    }
}
