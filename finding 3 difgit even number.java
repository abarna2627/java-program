class Solution {
    public int[] findEvenNumbers(int[] d) {
    boolean[] seen=new boolean[1000];
    for(int i=0;i<d.length;i++)
    for(int j=0;j<d.length;j++)
    for(int k=0;k<d.length;k++){
    if(i==j||j==k||i==k||d[i]==0||d[k]%2!=0) continue;
    int n=d[i]*100+d[j]*10+d[k];
   seen[n]=true;
    }
    int c=0;
    for(int i=100;i<1000;i++)
    if(seen[i]) c++;
    int r[]=new int[c];
    int j=0;
    for(int i=100;i<1000;i++)
    if(seen[i]) r[j++]=i;
    return r;
    }
}