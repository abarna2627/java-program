class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        for(int x:nums){
            if(x<10)
            sum+=x;
            else
            sum-=x;
        }
        return sum !=0;
        }
    }
