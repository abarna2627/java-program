class Solution {
    public int firstUniqChar(String s) {
        char[] c=s.toCharArray();
        int[] freq=new int[256];
        for(int i=0;i<c.length;i++){
            freq[c[i]]++;
        }
        boolean found=false;
        for(int i=0;i<c.length;i++){
            if(freq[c[i]]==1){
                found=true;
                return i;
            }
        }
        return -1;
        }
}