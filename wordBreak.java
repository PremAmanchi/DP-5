// tc : O(m*n)
// sc : O(m)
// m = s.length()
// n = wordDict.size()

class Solution {
    HashSet<String> set;
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.length() ==0 || s == null ) return false ;
        set =new HashSet<>(wordDict);
        return recurse(s);
    }

    public boolean recurse(String s){
        //terminate
        if(s.length() ==0 || s == null ) {
            return true ;
        }
        int n =s.length();
        for(int i = 1 ; i<=n ; i++){
            String sub = s.substring(0,i);
            if(set.contains(sub) && recurse(s.substring(i,n))){
                return true;
            }
        }
        return false;
    }
}
