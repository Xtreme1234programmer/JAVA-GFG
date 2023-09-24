
class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
          
         ArrayList < Integer > ans = new ArrayList < > ();
          
        // Incrementing all the values by n.
        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] += n;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 2 * n) {
                ans.add(i);
            }
        }

          if(ans.size() == 0){
              ans.add(-1);
          }
         return ans;               
    }
}
