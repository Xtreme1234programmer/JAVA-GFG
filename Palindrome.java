class Solution {
      static int isPalRec(String str,
                            int s, int e)
    {
        // If there is only one character
        if (s == e)
            return 1;
 
        // If first and last
        // characters do not match
        if ((str.charAt(s)) != (str.charAt(e)))
            return 0;
 
        // If there are more than
        // two characters, check if
        // middle substring is also
        // palindrome or not.
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);
 
        return 1;
    }
 
    static int isPalindrome(String str)
    {
        int n = str.length();
 
    // An empty string is
    // considered as palindrome
        if (n == 0)
            return 1;
 
        return isPalRec(str, 0, n - 1);
    }
}
