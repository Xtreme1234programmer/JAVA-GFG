class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
      
		HashSet<Integer> set=new HashSet<>();
		for(int ele1:a)
		{
			set.add(ele1);
		}
		for(int ele2:b)
		{
			set.add(ele2);
		}
	
	return set.size();
		
    }
}
