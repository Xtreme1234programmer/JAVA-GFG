class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        char[] arr=S.toCharArray();
        Arrays.sort(arr);
        String s=new String(arr);
        List<String> list=new ArrayList<>();
        dfs(s,list,"");
        return list;
    }
    
    private static void dfs(String s, List<String> list,String perm)
    {
        //base case
        if(s.length()==0) list.add(perm);
        
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!set.contains(ch)){
            String temp=s.substring(0,i)+s.substring(i+1);
            dfs(temp,list,perm+ch);
            }
             set.add(ch);
        }
       
    }
}
