class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                String p=s.substring(0,i);
                String t=p.repeat(n/i);
                if(t.equals(s))
                return true;
            }
        }
    return false;
    }
}