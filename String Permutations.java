class Solution
{
    public ArrayList<String> permutation(String S)
    {
        ArrayList<String> list = new ArrayList<>();
        find_perm(S,"",list);
        Collections.sort(list);
        return list;
        
    }
    static void find_perm(String s,String p,List<String> list){
        if(s.length() == 0){
	        list.add(p);
	    }
	    
	    for(int i = 0;i<s.length();i++){
	        char ch = s.charAt(i);
	        String ros = s.substring(0,i) + s.substring(i+1);
	        find_perm(ros,p+ch,list);
	    }
    }
}
