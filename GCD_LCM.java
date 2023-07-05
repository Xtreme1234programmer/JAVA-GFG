class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long res[]=new Long[2];
    
        
        Long gcd=gcd(A,B);
        Long lcm=(A*B)/gcd;
        
        res[0]=lcm;
        res[1]=gcd;
        
        return res;

        
        
        
        
    }
     static Long gcd(Long A, Long B)
    {
        
        if (B == 0)
            return A;
 
        else
            return gcd(B, A % B);
    }
}
