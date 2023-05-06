// For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
// NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371
class Solution {
    static String armstrongNumber(int n){
        // code here
        int arm=0;
        int temp=n;
        while(temp>0){
        int dig=temp%10;
        arm+=Math.pow(dig,3);
        temp/=10;
        }
        
        if(arm==n){ return "Yes";}
        else{
        return "No";
    }}
}
