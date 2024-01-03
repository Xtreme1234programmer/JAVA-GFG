class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele1:a)
        {
            map.put(ele1,map.getOrDefault(ele1,0)+1);
        }
        int count=0;
        for(int ele2:b)
        {
           if(map.containsKey(ele2))
           {
               count++;
               map.remove(ele2);
           }
        }
        return count;
    }
};
