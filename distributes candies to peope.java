class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int a[]=new int[num_people];
        int i=0;
        while(candies>0){
            int x=i+1;
            if(x>candies)
            x=candies;
            a[i%num_people]+=x;
            candies-=x;
            i++;
        }
        return a;
        }
    }
